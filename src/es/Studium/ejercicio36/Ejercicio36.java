package es.Studium.ejercicio36;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
       
		int opcion;
		Scanner teclado = new Scanner(System.in);
		do
		{
		System.out.println(" Indique el número correspondiente a una opción del siguiente menu:\n* Menú*\n1. Abrir\n2. Cerrar\n3. Modificar\n4. Salir");
		 		
		 		
		 opcion= teclado.nextInt();
		 switch (opcion)
		 {
		 case 1: 
			 System.out.println( "La opcion seleccionada es abrir");
			 break;
		 case 2: 
			 System.out.println( "La opcion seleccionada es cerrar");
			 break;
		 case 3: 
			 System.out.println( "La opcion seleccionada es modificar");
			 break;
		 case 4: 
			 System.out.println( "La opcion seleccionada es salir" );
			 break;
			 default: System.out.println( "Error" );
		 }
		}while(opcion!=4);
		teclado.close();	
 }
}