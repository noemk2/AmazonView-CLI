package com.noe.amazonviewer.model;

import java.util.Date;

public class Magazine {
	private int id;
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;


	public Magazine(String title, Date edititionDate, String editorial){
		super();
		this.title=title;
		this.edititionDate=edititionDate;
		this.editorial=editorial;
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

}
