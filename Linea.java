package epn;

public class Linea extends Punto{

	Punto coord1;
	Punto coord2;
	
	public Linea() {
		super();
		coord1=new Punto();
		coord2= new Punto();
	}
	public Linea(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public Linea(Punto coord1, Punto coord2) {
		super();
		this.coord1 = coord1;
		this.coord2 = coord2;
	}
	public Punto getCoord1() {
		return coord1;
	}
	public void setCoord1(Punto coord1) {
		this.coord1 = coord1;
	}
	public Punto getCoord2() {
		return coord2;
	}
	public void setCoord2(Punto coord2) {
		this.coord2 = coord2;
	}
	
	public double distancia(){	
		double d;
		d= Math.hypot(coord1.getY()-coord2.getY(), coord1.getX()-coord2.getX());
		return d;
	}
	@Override
	public String toString() {
		return "Linea [coord1=" + coord1.toString() + ", coord2=" + coord2.toString() + "]"
				+"\n y la distancia es: "+ distancia() ;
	}	
	
}
