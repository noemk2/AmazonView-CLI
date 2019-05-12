package com.noe.amazonviewer.model;

public class Magazine extends Publication{
	privateint id;		
			
	public Magazine(String title, Date editionDate, String editorial){
		super(title, editionDate, editorial);
	}

	publicintgetId(){
		return id;
	}
}