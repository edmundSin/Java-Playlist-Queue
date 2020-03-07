/* Edmund Sin
  * CISC 3130-TY9
  * Professor Chuang
  * 3/7/20
  * Assignment 2
  */ 

import java.io.*;
import java.util.*;

public class Playlist{
 
  Queue<String>playlist;
  SongHistoryList history;
  
  //no-arg constructor 
  public Playlist(){
  playlist = new LinkedList<String>();
  }
  
  public void addSongs(ArrayList<String>songs){
    //traverse through arraylist and add each song 
      for(int i = 1;i<songs.size();i++)
      playlist.add(songs.get(i));
  }
  
  public void addSong(String song){
    playlist.add(song);
  }
  
  public String listenToSong(){
    //add song that's about to be played into a SongHistoryList object with constructor 
    history = new SongHistoryList(playlist.peek());
    //return and remove first in playlist queue
    return(playlist.poll());
    
  }
  
  //getter calls lastListened method in SongHistoryList class that returns the song name
  public String getHistory(){
    return history.lastListened();
  }
  
  public int size(){
    return playlist.size();
  }
  
}