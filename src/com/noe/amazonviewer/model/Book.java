package com.noe.amazonviewer.model;

import java.util.Date;

public class Book {
	private int id;
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	private String isbn;
	private boolean readed;
	private int timeReaded;

	public Book(String title,Date edititionDate, String editorial, String isbn){
		super();
		this.title=title;
		this.edititionDate=edititionDate;
		this.editorial=editorial;
		this.isbn=isbn;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the edititionDate
	 */
	public Date getEdititionDate() {
		return edititionDate;
	}

	/**
	 * @param edititionDate the edititionDate to set
	 */
	public void setEdititionDate(Date edititionDate) {
		this.edititionDate = edititionDate;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the authors
	 */
	public String[] getAuthors() {
		return authors;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the readed
	 */
	public boolean isReaded() {
		return readed;
	}

	/**
	 * @param readed the readed to set
	 */
	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	/**
	 * @return the timeReaded
	 */
	public int getTimeReaded() {
		return timeReaded;
	}

	/**
	 * @param timeReaded the timeReaded to set
	 */
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

}
