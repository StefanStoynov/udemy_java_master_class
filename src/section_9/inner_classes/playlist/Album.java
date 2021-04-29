package section_9.inner_classes.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

  private String name;

  private String artist;

  private SongList songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new SongList();
  }

  public boolean addSong(String songTitle, double songDuration) {
    return songs.add(new Song(songTitle, songDuration));
  }

  public boolean addToPlayList(int numberOfSongInAlbum, LinkedList<Song> playlist) {
    int trackNumber = numberOfSongInAlbum - 1;
    Song addToPlayList = this.songs.findSong(trackNumber);
    if (addToPlayList == null) {
      System.out.println("This album does not have a track " + numberOfSongInAlbum);
      return false;
    }
    playlist.addLast(addToPlayList);
    return true;
  }

  public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
    Song songToAddInPlaylist = this.songs.findSong(songTitle);
    if (songToAddInPlaylist != null) {
      playlist.addLast(songToAddInPlaylist);
      return true;
    }
    System.out.println("The song " + songTitle + " is not in this album");
    return false;
  }

  public class SongList {

    private ArrayList<Song> songs;

    private SongList() {
      this.songs = new ArrayList<>();
    }

    private boolean add(Song song) {
      if (this.songs.contains(song)) {
        return false;
      }
      this.songs.add(song);
      return true;
    }

    private Song findSong(String trackTitle) {
      for (Song song : this.songs) {
        if (song.getTitle().equals(trackTitle)) {
          return song;
        }
      }
      return null;
    }

    private Song findSong(int trackNumber) {
      if (trackNumber < 1 || trackNumber > this.songs.size()) {
        return null;
      }
      return this.songs.get(trackNumber - 1);
    }
  }
}
