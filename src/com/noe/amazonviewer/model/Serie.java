package com.noe.amazonviewer.model;

public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private Chapter[] Chapters;

	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.setSessionQuantity(sessionQuantity);
		
	}


	public Chapter[] getChapters() {
		return Chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.Chapters = chapters;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public int getId() {
		return id;
	}

}
