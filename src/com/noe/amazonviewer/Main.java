package com.noe.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
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
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			//Leer la respuesta del usuario
						//Leer la respuesta del usuario
						Scanner sc = new Scanner(System.in);
						// haciendo un parceo
						int response = Integer.valueOf(sc.nextLine());
						// validar si el usuario le pasa una letra
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
								showBooks();
								break;
							case 4:
								showMagazines();
								break;
							case 5:
								makeReport();
								break;
							case 6:
								// Date date = new Date()
								makeReport(new Date());
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
		ArrayList<Movie> movies =Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
		    for (int i = 0; i < movies.size();i++) {
		    	System.out.println(i+1+" "+ movies.get(i).getTitle()+ "Visto: "+movies.get(i).isViewed());
			}
			System.out.println("0. Back to menu");
			System.out.println();
			
			// leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if (response == 0) {
				showmenu();
			}

			Movie movieSelected = movie.get(response-1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.starToSee(new Date());

			for (int i = 0; i < 10000; i++) {
				System.out.println("....");
				
			}
			// terminar de verla
			movieSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: "+movieSelected);
			System.out.println("Por: "+movieSelected.getTimeViewed()+ " milisegundo");

		}while (exit != 0);

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
	public static void makeReport(){
		
	}	
	public static void makeReport(Date date){
		
	}	
}
