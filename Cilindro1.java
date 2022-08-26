package Figuras;

public class Cilindro1 {

	public static void main(String[] args) {
		int r;
		double volumen,areaTotal, Abase, Pbase, h , areaLateral;
		
		r = 10;
		h = 16;
		Pbase = 2*Math.PI * r;
		Abase = Math.PI * Math.pow(r, 2);
		areaLateral = Pbase * h;
		areaTotal = areaLateral + (2* Abase);
		volumen = Abase * h;
		
		System.out.println("Datos del cilindro");
		System.out.println("Radio menor: " + r);
		System.out.println("Altura: " + h);
		System.out.println("Perimetro de la base: " + Pbase);
		System.out.println("Area de la base: " + String.format("%.2f", Abase));
		System.out.println("Area Lateral: " + areaLateral);
		System.out.println("Area Total: " + String.format("%.2f", areaTotal));
		System.out.println("Volumen: " + String.format("%2.f", volumen));

	}

}
