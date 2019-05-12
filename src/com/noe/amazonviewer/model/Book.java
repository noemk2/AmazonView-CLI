package com.noe.amazonviewer.model;

public class Book extends Publication implements IVisualizable{ 

	private int id;	
	private String isbn;
	private boolean readed;
	private int timeReaded;
		
	public Book(String title, Date editionDate, String editorial, String isbn){
		super(title, editionDate, editorial);
		this.isbn=isbn;
	}

	public intgetId(){
		return id;
	}

	public String getIsbn(){
		return isbn;
	}

	public voidsetIsbn(String isbn){
		this.isbn = isbn;
	}

	public booleanisReaded(){
		return readed;
	}

	public voidsetReaded(boolean readed){
		this.readed = readed;
	}

	public intgetTimeReaded(){
		return timeReaded;
	}

	public voidsetTimeReaded(int timeReaded){
		this.timeReaded = timeReaded;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = "\n :: BOOK ::" + 
							"\n Title: " + getTitle() +
							"\n Editorial: " + getEditorial() + 
							"\n Edition Date: " + getEdititionDate() +
							"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return  detailBook;
	}
	@Override
	public Date starToSee(Date dateI) {
		return dateI;
	}
	
	@Override
	public Date stopToSee(Date dateI,Date dateF) {
		if(dateF.getSeconds() > getI.getSeconds()){
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else{
			setTimeReaded(0);
		}
	}
}
