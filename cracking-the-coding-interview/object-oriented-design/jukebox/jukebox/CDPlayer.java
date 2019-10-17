package jukebox;

public class CDPlayer {

    private Playlist p;
    private CD c;

    /**. constructors **/
    public CDPlayer(Playlist p) { this.p = p; }
    public CDPlayer(CD c) { this.c = c; }
    public CDPlayer(CD c, Playlist p) {
        this.c = c;
        this.p = p;
    }

    /**. getters and setters **/
    public Playlist getPlaylist() { return p; }
    public void setPlaylist(Playlist p) { this.p = p; }
    public CD getCD() { return c; }
    public void setCD(CD c) { this.c = c; }

    /**. play song **/
    public void playSong(Song s) {}
}
