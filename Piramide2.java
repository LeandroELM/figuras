package Figuras;

public class Piramide2 {

	public static void main(String[] args) {
double r,l,n,volumen,areaTotal, Abase, Pbase, Ap, ap, areaLateral,h;
		
		r = 5;
		h = 8;
		l = 4;
		n = 5;
		Pbase = 2*Math.PI * r;
		ap = 1/(2*Math.tan(360/n)/2);
		Ap = Math.sqrt(h*h + ap*ap);
		Abase = l*l;
		areaLateral = Pbase * Ap /2;
		areaTotal = areaLateral + Abase;
		volumen = Abase * h /3;
		
		System.out.println("Datos de la piramide");
		System.out.println("Radio menor: " + r);
		System.out.println("Altura: " + h);
		System.out.println("Perimetro de la base: " + Pbase);
		System.out.println("Area de la base: " + Pbase);
		System.out.println("Area Lateral: " + areaLateral);
		System.out.println("Area Total: " + areaTotal);
		System.out.println("Volumen: " + volumen);

	}

}
