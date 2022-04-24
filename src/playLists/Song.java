package playLists;

/**
 * @author Efrain Laverde
 * @author Sebastian Giraldo
 */

public class Song {

    private String title;
    private int id;
    private String dateDebuted;
    private String songLength;
    private String gender;
    private String cover;
    private String description;

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

    @Override
    public String toString() {
        return "Song > " +
                "title: '" + title + '\'' +
                ", id: " + id +
                ", dateDebuted: '" + dateDebuted + '\'' +
                ", songLength: '" + songLength + '\'' +
                ", gender: '" + gender + '\'' +
                ", cover: '" + cover + '\'' +
                ", description: '" + description + '\'' + ".\n"+"\n"; // Show a doble line break
                

    }

    //Getters and Setters
    public int getId() {
        return this.id;
    }

    public String getDateDebuted() {
        return this.dateDebuted;
    }

    public String getGender() { return this.gender; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateDebuted(String dateDebuted) {
        this.dateDebuted = dateDebuted;
    }

    public String getSongLength() {
        return songLength;
    }

    public void setSongLength(String songLength) {
        this.songLength = songLength;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
