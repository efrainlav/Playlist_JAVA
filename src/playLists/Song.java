package playLists;

/**
 * @author Efrain Laverde
 * @author Sebastian Giraldo
 */

public class Song {

    public String title;
    public int id;
    public String dateDebuted;
    public String songLength;
    public String gender;
    public String cover;
    public String description;


    //Constructor of the class
    public Song(String title, int id,String dateDebuted, String songLength, String gender,
                String cover, String description){
        this.title = title;
        this.id = id;
        this.dateDebuted = dateDebuted;
        this.songLength = songLength;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    /**
    public void showSongs (int n){
        if (n == this.id){

        }
    }*/





}
