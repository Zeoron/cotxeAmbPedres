package net.srovira.provagrafics;

import java.awt.event.KeyEvent;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {
	private static final long serialVersionUID = -720681576099602729L;

	carretera Carretera;
	GImage imatgeCotxe = new GImage("elMeuCotxe.png");
	Random aleatori = new Random();
	
	public void init() {
		setSize(800, 800);
		addKeyListeners(this);
	}
	public void run() {
		GRectangle mida = new GRectangle(0,0,800, 800);
		
		//COTXE
		add(imatgeCotxe);
		imatgeCotxe.setLocation(200,100);
		imatgeCotxe.setSize(120,100);
		cotxe Cotxe = new cotxe(imatgeCotxe);
		System.out.println("Hola");
		Carretera = new carretera(Cotxe, mida);
		
		//PEDRES
		for (int i = 0; i<10;i++) {
			GImage imatgePedra = new GImage("rock.png");
			imatgePedra.setSize(50,50);
			add(imatgePedra);
			pedra Pedra = new pedra(imatgePedra, 
					aleatori.nextInt((int)(800-imatgePedra.getWidth())),
					aleatori.nextInt((int)(800-imatgePedra.getHeight())));
		}
	}
	
	public final void keyPressed(final KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			Carretera.moureCotxe(0, -1);
			break;
		 case KeyEvent.VK_DOWN:
			Carretera.moureCotxe(0, 1);
		    break;
		 case KeyEvent.VK_LEFT:
			 int lateral = -1;
			Carretera.moureCotxe(lateral, 0);
			canviImatge(lateral);
		    break;
		 case KeyEvent.VK_RIGHT:
			 int laterall = 1;
		    Carretera.moureCotxe(laterall, 0);
		    canviImatge(laterall);
		    break;
		 default:
		    break;
		}
	}
	public void canviImatge(int x) {
		if (x<0) {
			imatgeCotxe.setImage("elMeuCotxe2.png");
			imatgeCotxe.setSize(120,100);
		} else {
			imatgeCotxe.setImage("elMeuCotxe.png");
			imatgeCotxe.setSize(120,100);
		}
	}
	
}
