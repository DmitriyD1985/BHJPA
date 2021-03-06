package ru.timber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.timber.dao.AlbumsDAO;
import ru.timber.model.Albums;
import ru.timber.model.Songs;
import ru.timber.model.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

    AlbumsDAO albumsDAO;

    @Autowired
    public AlbumServiceImpl(AlbumsDAO albumsDAO) {
        this.albumsDAO = albumsDAO;
    }

    @Override
    public List<Albums> getallAlbums() {
        return albumsDAO.getallAlbums();
    }

    @Override
    public Albums getByName(String albumName) {
        return albumsDAO.getByName(albumName);
    }

    @Override
    public List<User> getUsersChoisedAlbums(Albums album) {
        return albumsDAO.getUsersChoisedAlbums(album);
    }

    @Override
    public void add(Albums albums) {
        albumsDAO.add(albums);
    }

    @Override
    public List<Songs> getSongsByAlbum(String album) {
        return albumsDAO.getSongsByAlbum(album);
    }
}
