package com.cip.prog;

import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El Quijote de La Mancha", "Miguel de Cervantes",2,0);
		Libro libro2 = new Libro("El Capit�n Alatriste", "Arturo P�rez Reverte",1,0);

		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do{
			System.out.print("__Men�__\n1. Ver Libros.\n2. Pr�stamo.\n3. Devoluci�n.\n0. Salir\nSu opci�n:");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1: 
					System.out.println(libro1.toString());
					System.out.println(libro2.toString());
					break;
				case 2: 
					System.out.println("�Qu� libro desea que le prestemos?\nPulse 1 para 'El quijote'\nPulse 2 para 'El capit�n Alatriste'");
					int opcionPrestamo=sc.nextInt();
					if(opcionPrestamo==1) {
						if(libro1.prestamo()==true) {
							System.out.println("Se le ha prestado el libro");
						}else {
							System.out.println("Imposible prestar el libro, no hay Stock");
						}
					}else if(opcionPrestamo==2) {
						if(libro2.prestamo()==true) {
							System.out.println("Se le ha prestado el libro");
						}else {
							System.out.println("Imposible prestar el libro, no hay Stock");
						}
					}else {
						System.out.println("Opci�n Incorrecta");
					}
					
					break;		
				case 3: 
					System.out.println("�Qu� libro desea devolver?\nPulse 1 para 'El quijote'\nPulse 2 para 'El capit�n Alatriste'");
					int opcionDevolucion=sc.nextInt();
					if(opcionDevolucion==1) {
						if(libro1.devolucion()==true) {
							System.out.println("Se ha devuelto el libro");
						}else {
							System.out.println("Imposible devolver el libro");
						}
					}else if(opcionDevolucion==2) {
						if(libro2.devolucion()==true) {
							System.out.println("Se ha devuelto el libro");
						}else {
							System.out.println("Imposible devolver el libro");
						}
					}else {
						System.out.println("Opci�n Incorrecta");
					}
					break;					
				case 0:
					System.out.println("�Hasta Otra!");
					break;					
				default:
					System.out.println("�Opcion incorrecta!");
					break;				
			}
				
		}while(opcion!=0);
	}

}
