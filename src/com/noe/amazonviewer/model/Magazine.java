package com.noe.amazonviewer.model;

public class Magazine extends Publication{
	privateint id;		
			
	public Magazine(String title, Date editionDate, String editorial){
		super(title, editionDate, editorial);
	}

	publicintgetId(){
		return id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: MAGAZINE ::" + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Edition Date: " + getEdititionDate();
	}
}