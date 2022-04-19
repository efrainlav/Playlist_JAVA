import playLists.Song;
import java.util.ArrayList;

public class Main {

    static ArrayList<Song> songs = new ArrayList<>();//para tener todas las canciones
    static ArrayList<Song> listFilterById = new ArrayList<>();//Para filtrar por id
    static ArrayList<Song> listFilterByYear = new ArrayList<>();//para filtrar por year
    static ArrayList<Song> listFilterByGender = new ArrayList<>();//para filtrar por genero

    public static void main(String[] args) {
        //creacion de canciones
        Song song1 = new Song("Otra noche en Miami", 1, "2018",
                "3 min 30 segundos", "Trapp", "Ojo","Cancion del album de Bad bunny");

        Song song2 = new Song("Yonaguni", 1, "2019",
                "4 min 20 segundos", "Trapp", "Camion","Cancion del album de Bad bunny Ultimo tour del mundo");

        Song song3 = new Song("Si veo a tu mama", 2, "2020",
                "2 min 50 segundos", "Trapp", "nino en cicla","Cancion del album de Bad bunny YHLQMDLG");
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        System.out.println("Todas las canciones: ");
        System.out.println(songs.toString());
        filteredById(1);
        filteredByYear("2018");
        filteredByGender("Trapp");

    }

    public static void filteredById (int n) {
        for (int i = 0; i < songs.size() ; ++i) {
            if (songs.get(i).getId() == n){
                listFilterById.add(songs.get(i));
            }
        }
        System.out.println("List of songs filtered by ID: ");
        for (int i = 0; i < listFilterById.size(); ++i) {
            System.out.println(listFilterById.get(i).toString());
        }
    }

    public static void filteredByYear(String year) {
        for (int i = 0; i < songs.size() ; ++i) {
            if (year.equals(songs.get(i).getDateDebuted())){
                listFilterByYear.add(songs.get(i));
            }
        }
        System.out.println("List of songs filtered by Year: ");
        for (int i = 0; i < listFilterByYear.size(); ++i) {
            System.out.println(listFilterByYear.get(i).toString());
        }
    }

        public static void filteredByGender(String gender) {
            for (int i = 0; i < songs.size() ; ++i) {
                if (gender.equals(songs.get(i).getGender())){
                    listFilterByGender.add(songs.get(i));
                }
            }
            System.out.println("List of songs filtered by Gender: ");
            for (int i = 0; i < listFilterByGender.size(); ++i) {
                System.out.println(listFilterByGender.get(i).toString());
            }
    }
}
