package com.mybatispage;

import java.util.List;

public class RunMyBatis {

	public static void main(String[] args) {
		AlbumsDAO albumsDAO = new AlbumsDAO();

		/* insert */
		Album album = new Album();
		album.setCatalogNumber("PCS 7088");
		album.setTitle("Abbey Road");
		album.setArtist("The Beatles");
		album.setGenre("Rock");
		album.setYear(1969);
		album.setFormat("Vinyl");
		album.setPrice(16);
		albumsDAO.save(album);
		System.out.println("---- The album with id:" + album.getCatalogNumber() + " saved! ----\n");

		/* select */
		album = albumsDAO.getAlbum("1A 062-97176");
		System.out.println("---- The selected album: ----");
		System.out.println(album + "\n");

		/* update */
		album.setArtist("Queen2");
		albumsDAO.update(album);
		System.out.println("---- The album " + album.getCatalogNumber() + " updated successfully ----\n");

		List<Album> albums = albumsDAO.getAllAlbums();
		System.out.println("\n---- The list of the albums: ----\n");
		for (Album a : albums) {
			System.out.println(a);
			System.out.println("\n");
		}

		/* delete */
		String catalogNumber = "PCS 7088";
		albumsDAO.delete(catalogNumber);
		System.out.println("---- The album, " + catalogNumber + " deleted! ----");
	}

}
