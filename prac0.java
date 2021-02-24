import java.util.*;

public class prac0{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String cad;
		int num;
		float flt;
		
		System.out.println("Cadena: ");
		cad = in.nextLine();
		System.out.println("Entero: ");
		num = in.nextInt();
		System.out.println("Flotante: ");
		flt = in.nextFloat();
		
		System.out.println("\ncad: " + cad);
		System.out.println("num: " + num);
		System.out.println("flt: " + flt);
	}
}