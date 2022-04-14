import playLists.Song;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        /**
        LinkedList songs =new LinkedList();
        ListIterator listIterator = songs.listIterator();


        Song song1 = new Song("Otra noche en Miami", 01, "2018",
                "3 min 30 segundos", "Trapp", "Ojo","Cancion del album de Bad bunny");

        Song song2 = new Song("Otra noche", 02, "12/03/2018",
                "3 min 30 segundos", "Reggateon", "Ojo","Cancion del album de Bad bunny");

        songs.add(song1);
        songs.add(song2);

        for (int i = 0; i <songs.size() ; i++) {
            System.out.println(songs.iterator());
        }*/
        Map<Integer, String, String, String> map = new HashMap<Integer, String, String, String>();
        map.put(1, "Casillas");		map.put(15, "Ramos");
        map.put(3, "Pique");		map.put(5, "Puyol");
        map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");		map.put(6, "Iniesta");
        map.put(7, "Villa");

        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));

        }
    }
}
