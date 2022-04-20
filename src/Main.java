import playLists.Song;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // attributes
    static Scanner scanner = new Scanner(System.in); //Java tool for user input data
    static int select = -1; //User choise temporal
    static ArrayList<Song> songs = new ArrayList<>();//create a new array of songs.
    static ArrayList<Song> listFilterById = new ArrayList<>();//Create a new array of sons for teh filter by ID
    static ArrayList<Song> listFilterByYear = new ArrayList<>();//Create a new array of sons for teh filter by dateDebuted
    static ArrayList<Song> listFilterByGender = new ArrayList<>();//Create a new array of sons for teh filter by Gender

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        //Create list de canciones
        Song song1 = new Song("Otra noche en Miami", 1, "2018",
                "3 min 30 segundos", "Trapp", "Ojo","Cancion del album de Bad bunny");

        Song song2 = new Song("Yonaguni", 2, "2019",
                "4 min 20 segundos", "Trapp", "Camion","Cancion del album de Bad bunny Ultimo tour del mundo");

        Song song3 = new Song("Si veo a tu mama", 3, "2020",
                "2 min 50 segundos", "Trapp", "nino en cicla","Cancion del album de Bad bunny YHLQMDLG");
        
        Song song4 = new Song("Si veo a tu mama", 4, "2020",
                "2 min 50 segundos", "Trapp", "nino en cicla","Cancion del album de Bad bunny YHLQMDLG");
        
        Song song5 = new Song("Si veo a tu mama", 5, "2020",
                "2 min 50 segundos", "Trapp", "nino en cicla","Cancion del album de Bad bunny YHLQMDLG");
        
        
        /**
         * Create array for the songs directory
         */
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

		//While ask for an options until the user selected are different of cero - 0
		while(select != 0){
			//Try catch to avoid the sudden end of the proggrame
			try{
                clearScreen();
				System.out.println("Elige opción:\n" +
                        "1.- Show Original Playlists Songs\n" +
                        "2.- Create New Playlist\n" +
						"3.- Filter Original Playlists by Debut Years\n" +
						"4.- Filter Original Playlists by Gender\n" +
						"5.- Sort Original Playlists by Debut Years\n" +
						"0.- Exit");
				
                        //Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){

				case 1:
                System.out.println("Original Playlist: ");
                System.out.println(songs.toString());
                System.in.read();
                System.out.println("\n"); //Show a line break
					break;

				case 2:
                filteredById(1);
                System.in.read();

					break;

				case 3:
                filteredByYear("2018");
                System.in.read();

					break;

				case 4: 
                filteredByGender("Trapp");
                System.in.read();

					break;

				case 5: 
                filteredByYear("2018");
                System.in.read();

					break;

				case 0: 
					System.out.println("Stay tuned!!!");
                    System.in.read();

					break;

				default:
					System.out.println("That selection is not supported");
                    System.in.read();
                    break;

				}
				
				System.out.println("\n"); //Show a line break
				
			}catch(Exception e){
				System.out.println("Hey Bro!, That's not the move!!!, Try again");
                
			}
		}


        


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

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     }
}
