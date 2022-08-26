package Figuras;

public class Cono {

	public static void main(String[] args) {
		
		float r=2, h=3;
		double g,areaLateral,areaTotal,volumen;
		
		g= Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
		areaLateral = Math.PI*r*g;
		areaTotal = Math.PI*r*(g+r);
		volumen = (Math.PI*Math.pow(r,2)*h)/3;
		
		System.out.println("la altura es: " + h);
		System.out.println("el radio es: " + r);
		System.out.println("--------------------");
		System.out.println("El area lateral: " + areaLateral);
		System.out.println("El area total: " + areaTotal);
		System.out.println("El volumen es: " + volumen);
		System.out.println("cuanto vale g?: " + g);
		
	}
}
