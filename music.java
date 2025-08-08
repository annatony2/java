import java.util.Scanner;

class Song{
    String title;
    String artist;
    float duration;
    static int totalSongs=0;
    
    Song(String title ,String artist,float duration){
        this.title=title;
        this.artist=artist;
        this.duration=duration;
        totalSongs++;
    }
    public void displaySongInfo(int i){
        System.out.println(i+") Title : "+title+" \n\tArtist - "+artist+"\n\tDuration ("+duration +")");
        System.out.println("----------------------");
    }
}
class Playlist{
    String playlistName;
    Song[] songs;
    int count;
    
    Playlist(String playlistName,int max){
        this.playlistName=playlistName;
        this.songs=new Song[max];
        count=0;
    }
    
     public void addSong(Song song) {
        if (count<songs.length) {
            songs[count]=song;
            count++;
            System.out.println("Added " + song.title);
        } else {
            System.out.println("Playlist is full!");
        }
    }
    public void showPlaylist(){
         System.out.println("Playlist : "+playlistName);
         if(count==0){
             System.out.println("Playlist is empty ! ");
         }else{
             for(int i=0;i<count;i++){
                 songs[i].displaySongInfo(i+1);
             }
         }
    }

}
public class Music {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
          Song[] allSongs = {
            new Song("Shape of You", "Ed Sheeran", 4.2f),
            new Song("Blinding Lights", "The Weeknd", 3.5f),
            new Song("Unstoppable", "Sia", 4.0f),
            new Song("Levitating", "Dua Lipa", 3.8f),
            new Song("Believer", "Imagine Dragons", 3.4f)
        };
         System.out.println("Songs available : ");
        
         for(int i=0;i<allSongs.length;i++){
            allSongs[i].displaySongInfo(i+1);
        }
        
         System.out.print("\nEnter Playlist Name : ");
         String name = sc.nextLine();
         
         Playlist playlist=new Playlist(name,10);
         
         System.out.print("\nEnter song number to add (0 to finish): ");
          int choice=sc.nextInt();
          
          if(choice>=1&&choice<=allSongs.length){
              playlist.addSong(allSongs[choice-1]);
            }else{
                System.out.println("Invalid song number.");
            }

        playlist.showPlaylist();
        System.out.println("\n Total songs : "+Song.totalSongs);
        sc.close(); 

        
         
    }
}