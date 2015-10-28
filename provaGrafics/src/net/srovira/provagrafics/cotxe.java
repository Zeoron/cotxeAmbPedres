package net.srovira.provagrafics;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class cotxe {
	private static final int VELOCITATDELCOTXE = 10;
	GImage imatge;
	int velocitat = VELOCITATDELCOTXE;
	
	public cotxe(GImage image) {
		imatge = image;
	}
	public void moure(int x, int y) {
		imatge.move(x * velocitat, y * velocitat);
	}
	public GRectangle getPosicio() {
		return imatge.getBounds();
	}
	public GImage canviarImatge(GImage novaImatge) {
		return imatge = novaImatge;
	}
}
