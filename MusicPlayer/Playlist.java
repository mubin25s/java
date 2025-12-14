package MusicPlayer;

import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> songs;

    public Playlist() {
        this.songs = new LinkedList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void playAll() {
        for (Song song : songs) {
            System.out.println("Playing: " + song);
        }
    }
}
