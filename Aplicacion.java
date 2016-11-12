package epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Punto, lineas y figuras");
		JOptionPane.showMessageDialog(null, "Punto");		
		Punto punto = coordPunto();
		JOptionPane.showMessageDialog(null, punto.toString());
		
		JOptionPane.showMessageDialog(null, "Linea\n Ingrese las coordenadas de los 2 puntos");
		Punto linea1= new Linea(coordPunto(), coordPunto());
		JOptionPane.showMessageDialog(null, linea1 );
		
		JOptionPane.showMessageDialog(null, "Rectángulo\n Ingrese el ancho y la altura y la coordenada del centro");
		String linea= JOptionPane.showInputDialog("Ingrese el ancho y la altura separado por comas");
		StringTokenizer tokens= new StringTokenizer(linea, ",");
		int an= Integer.parseInt(tokens.nextToken());
		int al=Integer.parseInt(tokens.nextToken());
		Figura rectangulo= new Rectangulo(coordPunto(),an,al);
		JOptionPane.showMessageDialog(null, rectangulo +"\n el área es: "+rectangulo.calcularArea());
		
		JOptionPane.showMessageDialog(null, "Circulo\n Ingrese el radio y la coordenada del centro");
		int r= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
		Figura circulo= new Circulo(r, coordPunto());
		JOptionPane.showMessageDialog(null, circulo + "\nEl area es: "+ circulo.calcularArea());
		
		JOptionPane.showMessageDialog(null, "Ingrese los 3 puntos del triángulo");
		Figura triangulo= new Triangulo(coordPunto(),coordPunto(),coordPunto());
		JOptionPane.showMessageDialog(null,triangulo + "\n El área es: "+triangulo.calcularArea());
		
	}
	
	public static Punto coordPunto(){
		Punto aux;
		String linea= JOptionPane.showInputDialog("PUNTO\nIngrese las coordenadas del punto separadas por una coma(sin espacio):  ");
		StringTokenizer tokens= new StringTokenizer(linea, ",");
		int x= Integer.parseInt(tokens.nextToken());
		int y= Integer.parseInt(tokens.nextToken());
		aux= new Punto(x,y);
		return aux;
	}

}
