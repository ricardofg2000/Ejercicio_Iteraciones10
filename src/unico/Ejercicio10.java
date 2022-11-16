package unico;

import java.util.Scanner;

public class Ejercicio10 {
	

	public static void main(String[] args) {
		/*
		 Implementar una aplicación que pida un número al 
		 usuario entre el 1 y el 10, y calcule su tabla de multiplicar. 
		 El código debe asegurarse de que el número introducido está 
		 entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.
		 */
		
		Scanner leer = new Scanner (System.in);
		int num;
		int mult;
		String mensaje;
		
		do {
			System.out.print("Introduzca un número del 1 al 10: ");
			num=Integer.parseInt(leer.nextLine());
		} while (num > 10 || num < 1);
		
		for(int i=1; i<=10;i++) {
			mult = num*i;
			mensaje = num + " x " + i + " = " + mult;
			System.out.println(mensaje);
		}
	
	}
}
