package section_8.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<>();
  }

  public boolean addSong(String songTitle, double songDuration){
    if (findSong(songTitle) == null){
      this.songs.add(new Song(songTitle,songDuration));
      return true;
    }
    return false;
  }

  private Song findSong (String songTitle){
    for (Song song : songs) {
      if (song.getTitle().equals(songTitle)) {
        return song;
      }
    }
    return null;
  }

  public boolean addToPlayList(int numberOfSongInAlbum, LinkedList<Song>playlist){
    if(numberOfSongInAlbum < 1 || numberOfSongInAlbum >= songs.size()){
      return false;
    }
    Song songToAddInPlaylist = this.songs.get(numberOfSongInAlbum-1);
    playlist.addLast(songToAddInPlaylist);
    return true;
  }

  public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
    Song songToAddInPlaylist = findSong(songTitle);
    if (songToAddInPlaylist != null){
      playlist.addLast(songToAddInPlaylist);
      return true;
    }
    return false;
  }

}
