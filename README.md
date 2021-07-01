# Project-2 (Playlist Queue) 

My code basically operates as following:
(main method PlaylistAssignment class)
1. add all .csv file names into an arraylist
2. create another arraylist to store song names from .csv files
3. use a custom method to read .csv files and extract the top 10 songs of each week into the arraylist
4. delete duplicates and sort the arraylist in alphabetical order
5. create reference object of the Playlist class which contains the Queue/linkedlist 
   and a SongHistoryList class reference object
6. call a custom method from Playlist class to add all songs from the arraylist into 
   the queue/linked list
7. use a while loop to call method listenToSong() that will poll() all elements from the queue 
8. at the same time, each song name will be recorded to the SongHistoryList class by using a 
   constructor 
9. still within the while loop, the listening history will be printed along with the queue 
   position to the output file (myoutput.txt)
