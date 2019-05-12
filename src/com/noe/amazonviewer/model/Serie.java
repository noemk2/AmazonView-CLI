package com.noe.amazonviewer.model;

public class Serie {
	
	private int id;
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;

	int sessionQuantity;

	// chapters[]
	public Serie(String title, String genre, int duration) {
		super();
		this.setTitle(title);
		this.setGenre(genre);
		this.setDuration(duration);
	}

	/**
	 * @return the timeViewed
	 */
	public int getTimeViewed() {
		return timeViewed;
	}

	/**
	 * @param timeViewed the timeViewed to set
	 */
	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	/**
	 * @return the viewed
	 */
	public boolean isViewed() {
		return viewed;
	}

	/**
	 * @param viewed the viewed to set
	 */
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

	/**
	 * @return the year
	 */
	public short getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(short year) {
		this.year = year;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
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
	

}
