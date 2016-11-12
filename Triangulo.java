package epn;

public class Triangulo extends Figura{
	
	Punto p1;
	Punto p2;
	Punto p3;
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangulo(Punto p1, Punto p2, Punto p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public Punto getP3() {
		return p3;
	}
	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	
	public double distancia( Punto p1, Punto p2){
		double d;
		d= Math.hypot(p1.getY()-p2.getY(), p1.getX()-p2.getX());
		return d;
		
	}
	@Override
	public double calcularArea() {
		double d1, d2, d3, p;
		d1= distancia(p1, p2);
		d2= distancia(p2, p3);
		d3= distancia(p1, p3);
		p = (d1+d2+d3)/2;
		return Math.sqrt(p)*(p-d1)*(p-d2)*(p-d3);
	}
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Triangulo [p1=" + p1.toString() + ", p2=" + p2.toString() + ", p3=" + p3.toString() + "]";
	}
	
	

}
