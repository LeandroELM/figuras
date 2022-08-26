package Figuras;

public class Piramide3 {

	public static void main(String[] args) {
		double h,l,ap, Ap, Pbase, areaTotal,areaLateral,volumen,Abase;
		
		h= 13;
		l = 5;
		
		ap = l/2;
		Ap = Math.sqrt(h*h + ap + ap);
		Pbase = (4 * l);
		areaLateral = (Pbase * ap)/2;
		Abase = (l*l);
		areaTotal = areaLateral + Abase;
		volumen = ((Abase*h)/3);
		System.out.println("1.La altura de la piramide es : " + h);
		System.out.println("1.El perimetro de la base de la piramide es : " + Pbase);
		System.out.println("La longitud de los lados de la base es de: " + l);
		System.out.println("El area de la base de la piramide es : " + Abase);
		System.out.println("El area de lateral de la piramide es: " + String.format("%.2f", areaLateral));
		System.out.println("El area total de la piramide es: " + String.format("%.2f", areaTotal));
		System.out.println("el volumen de la piramide es : " + String.format("%.2f", volumen));
		System.out.println("El apotema de la piramide es: " + Ap);
		

	}

}
