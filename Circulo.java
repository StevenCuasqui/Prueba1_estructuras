package epn;

import java.awt.Graphics;

public class Circulo extends Figura {
	
	int radio;
	Punto centro;
	
	public Circulo() {
		super();
		/*centro= new Punto();
		radio=10;*/
	}
	
	public Circulo(int radio, Punto centro) {
		super();
		this.radio = radio;
		this.centro = new Punto();
	}

	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	/*public void dibujar(Graphics g ){
		super.paint(g);
		g.drawOval(this.getX(),this.getY(),radio, radio);  ------->JPanel
	}*/
	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro.toString() + "]";
	}
	
}
