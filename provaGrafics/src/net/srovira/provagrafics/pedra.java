package net.srovira.provagrafics;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class pedra {
	GImage imatge;
	
	public pedra(GImage image, int x, int y) {
		imatge = image;
		imatge.setLocation(x,y);
	}
	public GRectangle getPosition() {
		return imatge.getBounds();
	}
}
