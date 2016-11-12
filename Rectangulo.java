package epn;

public class Rectangulo extends Figura {
	private Punto origen;
	private int alto;
	private int ancho;
	
	public Rectangulo() {
		super();
		origen= new Punto();
		//por defecto el constructor vacio da valores iniciales de cero
	}
	public Rectangulo(Punto origen, int alto, int ancho) {
		super();
		this.origen = origen;
		this.alto = alto;
		this.ancho = ancho;
	}
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	@Override
	public double calcularArea() {
	
		return alto*ancho;
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Rectangulo [origen=" + origen.toString() + ", alto=" + alto + ", ancho=" + ancho + "]";
	}
	
}
