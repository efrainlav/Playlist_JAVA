import playLists.Song;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // attributes
    static Scanner scanner = new Scanner(System.in); //Java tool for user input data
    static int select = -1; //User choise temporal
    static ArrayList<Song> songs = new ArrayList<>();//create a new array of songs.
    public static ArrayList<Song> newplaylist = new ArrayList<>();//create a new array of songs for the new playlist.
    public static ArrayList<Song> templaylist = new ArrayList<>();//create a new array of songs for the new playlist.

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
        
        Song song4 = new Song("Si veo a tu mama", 4, "2022",
                "2 min 50 segundos", "Trapp", "nino en cicla","Cancion del album de Bad bunny YHLQMDLG");
        
        Song song5 = new Song("Si veo a tu mama", 5, "2017",
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
                /**clearScreen();*/
				System.out.println("Select an option:\n" +
                        "1.- Show Original Playlists Songs\n" +
                        "2.- Create a New Playlist\n" +
						"3.- Filter Original Playlists by Debut Years\n" +
						"4.- Filter Original Playlists by Gender\n" +
						"5.- Sort Original Playlists by Debut Years\n" +
						"0.- Exit");
				
                        //Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){

				case 1:
                System.out.println();
                System.out.println("Original Playlist: ");
                System.out.println(songs.toString());
                System.out.println("\n"); //Show a line break

					break;

				case 2:

                newplaylist = newPlaylist();
                System.out.println("\n"); //Show a line break
                System.out.println("New Playlist: ");
                System.out.println(newplaylist.toString());
                
					break;

				case 3:
                filteredByYear();
                System.out.println("\n"); //Show a line break
					break;

				case 4: 
                filteredByGender("Trapp");
                System.in.read();
                System.out.println("\n"); //Show a line break
					break;

				case 5: 
                filteredByYear();
                System.out.println("\n"); //Show a line break
					break;

				case 0: 
					System.out.println("Stay tuned!!!");
                    System.in.read();
                    System.out.println("\n"); //Show a line break


					break;

				default:
					System.out.println("That selection is not supported");
                    System.in.read();
                    System.out.println("\n"); //Show a line break

                    break;

				}
				
				System.out.println("\n"); //Show a line break
				
			}catch(Exception e){
				System.out.println("Hey Bro!, That's not the move!!!, Try again");
                System.out.println("\n"); //Show a line break
                
			}
		}


        


    }


/**
 * Method to create a new playlist of song
 * @return temporal playlist with the selected songs.
 */
    public static ArrayList<Song> newPlaylist(){
        int id = -1;
        int option = -1;
        newplaylist.removeAll(newplaylist);
        while(option != 0){
            // System.out.println("Original Playlist: ");
            // System.out.println(songs.toString());
            System.out.println("\n"); //Show a line break
            System.out.println("Input the ID of song to add:");
            //Input the value of the id to search
            id = Integer.parseInt(scanner.nextLine());
            System.out.println(id); //Show a line break
            templaylist=filteredById(id);
            newplaylist.addAll(templaylist);
            System.out.println("Do you want to add more songs?:\n" +
            "1.- YES\n" +
            "2.- NO\n");
            option = Integer.parseInt(scanner.nextLine());
            if(option == 1){
                System.out.println("Look again the Original PLaylist.");
                templaylist=null;
            } else{
                option=0;
                System.out.println("Enjoy your music!!");

            }
        }

        return newplaylist;
    }










    public static ArrayList<Song> filteredById (int n) {
        for (int i = 0; i < songs.size() ; ++i) {
            if (songs.get(i).getId() == n){
                listFilterById.add(songs.get(i));
            }
        }
        System.out.println("List of songs filtered by ID: ");
        for (int i = 0; i < listFilterById.size(); ++i) {
            System.out.println(listFilterById.get(i).toString());
        }

        return listFilterById;
    }



        /**
     * Method to filter any song by the year of debuted
     * @return the song filtere
     */

    public static void filteredByYear() {
        String year;
        System.out.println("\n"); //Show a line break
        System.out.println("Input the year:");
        //Input the value of the id to search
        year = scanner.nextLine();
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
