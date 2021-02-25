package com.mybatispage;

public class Album {
	private String catalogNumber;
	private String title;
	private String artist;
	private String genre;
	private int year;
	private String format;
	private int price;

	public String getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CatalogNumber: " + catalogNumber + "\ntitle: " + title + "\nartist: " + artist + "\ngenre: " + genre
				+ "\nyear: " + year + "\nformat: " + format + "\nprice: " + price + "$";
	}
}