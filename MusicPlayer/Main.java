package MusicPlayer;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Song("Imagine", "John Lennon"));
        playlist.playAll();
    }
}
