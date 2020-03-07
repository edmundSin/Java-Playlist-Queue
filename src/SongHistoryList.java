/* Edmund Sin
  * CISC 3130-TY9
  * Professor Chuang
  * 3/7/20
  * Assignment 2
  */ 

public class SongHistoryList {
  
  private String song;
  
  // constructor 
  public SongHistoryList(String s){
   song = s; 
  }
  
  public void addSong(String s){
   song = s;
  }
  
  public String lastListened(){
    return song;
  }
}