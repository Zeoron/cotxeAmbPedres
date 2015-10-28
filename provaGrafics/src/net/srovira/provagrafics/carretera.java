package net.srovira.provagrafics;

import java.util.List;
import java.util.ArrayList;

import acm.graphics.GRectangle;

public class carretera {
	GRectangle mida;
	cotxe Cotxe;
	List<pedra> pedres = new ArrayList<pedra>();
	
	public carretera(cotxe Cotxe, GRectangle g) {
		mida = g;
		this.Cotxe = Cotxe;
	}
	public void afegirPerdra(pedra ella) {
		pedres.add(ella);
	}
	
	public void moureCotxe(int x, int y) {
		GRectangle pos = Cotxe.getPosicio();
		pos.setLocation(pos.getX() + 5 * x, pos.getY() + 5 * y);
		
		if (pos.intersection(mida).equals(pos)){
			Cotxe.moure(x, y);
		} else {
			System.out.println("Stop!");
		}
	}
}
