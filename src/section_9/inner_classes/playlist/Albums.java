package section_9.inner_classes.playlist;

import java.util.ArrayList;

public class Albums {

  private ArrayList<Album> albums;

  public Albums() {
    this.albums = new ArrayList<>();
  }

  public boolean add(Album album) {
    if (!this.albums.contains(album)) {
      this.albums.add(album);
      return true;
    }
    return false;
  }

  public Album get(int albumNumber){
   return findAlbum(albumNumber);
  }

  private Album findAlbum(int albumNumber){
    if (albumNumber < 0 || albumNumber > albums.size()){
      return null;
    }
    return this.albums.get(albumNumber);
  }
}
