package playlist.DAO;

import playlist.models.Song;

import java.util.ArrayList;
import java.util.List;

public class SongDAO {
    private static int SONG_COUNT;
    private List<Song> songList;
    {
        songList = new ArrayList<>();
        songList.add(new Song(++SONG_COUNT, "Name1", "Style1", 120, "Artist1", "Label1", "Album1"));
        songList.add(new Song(++SONG_COUNT, "Name2", "Style2", 120, "Artist2", "Label2", "Album2"));
    }

    public List<Song> index(){
        return songList;
    }

    public Song show(int id){
        return songList.stream().filter(song -> song.getId() == id).findAny().orElse(null);
    }

    public void save(Song song){
        song.setId(++SONG_COUNT);
        songList.add(song);
    }

    public void update(int id, Song song){
        Song temp = show(id);
        temp.setName(song.getName());
        temp.setArtist(song.getArtist());
        temp.setDurationSec(song.getDurationSec());
        temp.setAlbum(song.getAlbum());
        temp.setLabel(song.getLabel());
        temp.setStyle(song.getStyle());
    }

    public void delete(int id){
        songList.removeIf(song -> song.getId() == id);
    }
}
