import java.util.ArrayList;

public class album {

    public album(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private String name;
    private String artist;
    private ArrayList<Song>songs;

    public boolean findSong(String title)
    {
        for(Song checkSong:this.songs)
        {
            if(checkSong.getTitle().equals(title)){
                System.out.println("Songs Found!");
                return true;
            }
        }
        return  false;
    }
    public boolean addSong(String title, double duration)
    {
        if(!findSong(title))
        {
            songs.add(new Song(title, duration));
            System.out.println("Song was added successfully");
            return true;
        }
        
            System.out.println("Song was already found");
            return false;

    }

}
