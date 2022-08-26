package Figuras;

public class Esfera {

	public static void main(String[] args) {
		double r,area,volumen;
		r=6;
		area=4*Math.PI*(r*r);
		volumen = 4*(Math.PI*(r*r*r))/3;
		System.out.println("Datos de la esfera: " );
		System.out.println("El radio de la esfera: " + String.format("%.2f", r));
		System.out.println("El area de la esfera es de: " + String.format("%.2f", area));
		System.out.println("El volumen de la esfera es: " + String.format("%.2f",volumen));
		

	}

}
