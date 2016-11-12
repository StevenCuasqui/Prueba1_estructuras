package epn;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Punto  {
	
	protected int x;
	protected int y;
	
	
	public Punto() {
		super();
		//por defecto el constructor vacio da valores iniciales de cero
		
	}
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	



}
