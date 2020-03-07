 /* Edmund Sin
  * CISC 3130-TY9
  * Professor Chuang
  * 3/7/20
  * Assignment 2
  */ 

import java.io.*;
import java.util.*;

/* An example for working with multiple text files */
public class PlaylistAssignment {
  
  public static void main (String [] args)throws IOException{
  
   //arraylist of csv file names
   ArrayList<String> myFiles = new ArrayList<String>();
   
   //add week 1
   myFiles.add("regional-us-weekly-2020-02-07--2020-02-14.csv");
   //add week 2
   myFiles.add("regional-us-weekly-2020-02-14--2020-02-21.csv");
   //add week 3  
   myFiles.add("regional-us-weekly-2020-02-21--2020-02-28.csv");
   //add week 4
   myFiles.add("regional-us-weekly-2020-02-28--2020-03-06.csv");

  
  //array of artist names
    ArrayList<String> songName = new ArrayList<String>();
    
   
   String outFile = "myoutput.txt";
   PrintWriter output = new PrintWriter(outFile);
   
   //call readFiles method to add song titles into songName arraylist
   readFiles(myFiles,songName);
   
   //delete duplicates and addAll back into arraylist
   Set<String> set = new LinkedHashSet<String>(songName);
   songName.clear();
   songName.addAll(set);
   
   //sort arraylist in alphabetical order 
   Collections.sort(songName);
   
   //create Playlist class reference object
   Playlist playlist = new Playlist();
   //call addSongs method and use songName arraylist as parameter 
   playlist.addSongs(songName);
   
   int position = 1;
   int playlistSize = playlist.size();
   
   //while there are songs, keep listening 
   while(position <= playlistSize){
   //listen to songs in order of queue by calling listenToSong method 
   playlist.listenToSong();
   //print song history to output file 
   output.println("Playing from Queue: " + position + "   " + playlist.getHistory());
   position++;
   }
   
   output.flush();
   output.close();
  }
  
  //method to read data from csv files into an arraylist
  public static void readFiles(ArrayList<String>files, ArrayList<String>list)throws IOException{
    
    //reads up to 4 files
    for(int n = 0; n<4; n++){
   //to read file
   FileInputStream in = new FileInputStream(files.get(n));
   BufferedReader myInput = new BufferedReader(new InputStreamReader(in));
   String thisLine;
     
      while ((thisLine = myInput.readLine()) != null) {
      String str[] = thisLine.split(",");
      //gets rid of "Track Name" label 
      if(!str[1].equals("\"Track Name\""))
      //fill songName arraylist with the title stored at index 1
      list.add(str[1]);
      //stop adding after 10 songs on each list 
      if(str[0].equals ("10"))
        break;
        }
   }
  }

}