package playlist.models;

import java.io.Serializable;

public class Song implements Serializable {
    private int id;
    private String name;
    private String style;
    private int durationSec;
    private String artist;
    private String label;
    private String album;


    public Song(int id, String name, String style, int durationSec, String artist, String label, String album) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.durationSec = durationSec;
        this.artist = artist;
        this.label = label;
        this.album = album;
    }
    public Song(){}

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }

    public int getDurationSec(){
        return durationSec;
    }
    public void setDurationSec(int durationSec){
        this.durationSec = durationSec;
    }

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }

    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album = album;
    }

    @Override
    public String toString() {
        return  "id:'" + id + '\'' +
                "name:'" + name + '\'' +
                ", style:'" + style + '\'' +
                ", artist:" + artist + '\'' +
                ", duration(sec):" + durationSec + '\'' +
                ", label:'" + label + '\'' +
                ", album:" + album;
    }
}
