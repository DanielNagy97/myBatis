package com.mybatispage;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class AlbumsDAO {
	public void save(Album album) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("com.mybatispage.AlbumMapper.insertAlbum", album);
		session.commit();
		session.close();
	}

	public void update(Album album) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("com.mybatispage.AlbumMapper.updateAlbum", album);
		session.commit();
		session.close();
	}

	public void delete(String catalogNumber) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("com.mybatispage.AlbumMapper.deleteAlbum", catalogNumber);
		session.commit();
		session.close();
	}

	public Album getAlbum(String catalogNumber) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Album album = session.selectOne("com.mybatispage.AlbumMapper.selectOneAlbum", catalogNumber);
		session.close();
		return album;
	}

	public List<Album> getAllAlbums() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Album> albums = session.selectList("com.mybatispage.AlbumMapper.selectAllAlbums");
		session.close();
		return albums;
	}

}
