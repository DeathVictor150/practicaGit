package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoParque {

	public static void main(String[] args) {
		Parque acuatico = new Parque(200, 1000, 10000);
		
		Scanner sc = new Scanner (System.in);
		//variables
		int opcion = 0;
		int entradas = 50;
		int chanclas = 0;
		int souvenir = 10;
		boolean volver = true;
		int repetir = 0;
		
do {	
	
	do {	
		try {
		//Menu de elecciones
		System.out.println ("Elige una opcion");
		System.out.println ("1) Vender entradas");
		System.out.println ("2) Vender chanclas");
		System.out.println ("3) Vender souvenir");
		System.out.println ("4) Comprobar aforo");
		opcion = sc.nextInt(); //subceptible a error 
		repetir = 1;
		}catch (InputMismatchException e) {
			System.out.println ("Has introducido un valor decimal o alfabetico");	
		}finally {
			sc.nextLine();
		}
	}while (repetir == 0);
		
		
		switch (opcion) {
		//Case de entradas que se van a vender
		case 1:
		do {
			try {
			System.out.println("Cuantas entradas se van a vender");
			entradas = sc.nextInt(); //subceptible a error
			repetir = 2;
			}catch (InputMismatchException e) {	
			System.out.println ("Has introducido un valor decimal o alfabetico");	
			}finally {
				sc.nextLine();
			}
	}while (repetir == 1);
			acuatico.venderEntradas(entradas);
			break;
		case 2:
		//Case de chanclas que se van a vender
		do {
			try {
			System.out.println("Cuantas chanclas se van a vender");
			chanclas = sc.nextInt(); //subceptible a error 
			repetir = 2;
			}catch (InputMismatchException e) {	
			System.out.println ("Has introducido un valor decimal o alfabetico");	
			}finally {
				sc.nextLine();
			}
	}while (repetir == 1);
			acuatico.venderChanclas(chanclas);
			break;
			
		case 3:
		//Case de souvenirs que se van a vender
		do {
			try {
			System.out.println("Cuantos souvenir se van a vender");
			souvenir = sc.nextInt(); //subceptible a error 
			repetir = 2;
			}catch (InputMismatchException e) {	
			System.out.println ("Has introducido un valor decimal o alfabetico");	
			}finally {
				sc.nextLine();
			}
	}while (repetir == 1);
			acuatico.venderSouvenir(souvenir);
			break;
		
		case 4:
			System.out.println(acuatico.dameAforo());
			
			break;
		
		default:
			System.out.println("Error has introducido un valor erroneo");
		}
	
	System.out.println("");
	//Siempre se va a repetir el menu porque la variable volver no va a cambiar a false
	}while (volver == true);
	
	sc.close();
		
	}

}
