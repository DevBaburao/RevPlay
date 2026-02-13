package com.revplay.service;

import com.revplay.dao.AlbumDaoImpl;
import com.revplay.dao.IAlbumDao;
import com.revplay.model.Album;
import com.revplay.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlbumServiceImpl implements IAlbumService {

    private IAlbumDao albumDao = new AlbumDaoImpl();

    @Override
    public boolean createAlbum(Album album) {
        return albumDao.createAlbum(album);
    }

    @Override
    public Album getAlbumById(int albumId) {
        return albumDao.getAlbumById(albumId);
    }

    @Override
    public List<Album> getArtistAlbums(int artistId) {
        return albumDao.getAlbumsByArtistId(artistId);
    }

    @Override
    public List<Album> getAllAlbums() {
        // Implement logic here or add to DAO. For now simple query here to satisfy
        // interface
        // Ideally should be in DAO, but doing here for speed in this iteration
        List<Album> list = new ArrayList<>();
        String sql = "SELECT * FROM ALBUM";
        try (Connection conn = JDBCUtil.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Album a = new Album();
                a.setAlbumId(rs.getInt("album_id"));
                a.setArtistId(rs.getInt("artist_id"));
                a.setTitle(rs.getString("title"));
                a.setDescription(rs.getString("description"));
                a.setCoverImageUrl(rs.getString("cover_image_url"));
                a.setReleaseDate(rs.getDate("release_date").toLocalDate());
                list.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
