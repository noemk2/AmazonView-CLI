package com.noe.amazonviewer;

import com.noe.amazonviewer.model.Movie;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showmenu();
	}

	public static void showmenu(){
		int exit = 0;
		do {
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			//Leer la respuesta del usuario
						//Leer la respuesta del usuario
						int response = 0;
						switch (response) {
							case 0:
								//salir
								
								break;
							case 1:
								showMovies();
								break;
							case 2:
								showSeries();
								break;
							case 3:
								showChapters();
							break;
							case 4:
								showBooks();
							break;
							case 5:
								showMagazines();
								break;
							default:
								System.out.println();
								System.out.println("....¡¡Selecciona una opción!!....");
								System.out.println();
								break;
						}
			
		}while(exit != 0);
	}

	public static void showMovies(){
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
		} while (exit != 0);

	}
	
	public static void showSeries(){
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();
		} while (exit != 0);
	}
	public static void showChapters(){
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Chapters ::");
			System.out.println();
		} while (exit != 0);
	}
	public static void showBooks(){
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
		} while (exit != 0);
	}
	public static void showMagazines(){
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Magazines ::");
			System.out.println();
		} while (exit != 0);	
	}
}
