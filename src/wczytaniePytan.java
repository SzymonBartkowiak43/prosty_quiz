import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class wczytaniePytan {
    private  ArrayList<String> pyt = new ArrayList<String>();
    private ArrayList<String> odp = new ArrayList<String>();
    private ArrayList<String> praw = new ArrayList<String>();
    private ArrayList<String> wyjasnienie = new ArrayList<String>();

    public void wczytaj() throws FileNotFoundException {
        File file = new File("pytania.txt");
        Scanner scanner = new Scanner(file);
        int licznikLini = 1;
        String pytanie;

        while (scanner.hasNext())
        {
            if(licznikLini % 8 == 1) { //wczytanie pytan
                pytanie = scanner.nextLine();
                pyt.add(pytanie);
            }
            else if(licznikLini % 8 == 6) {//wczytanie prawidlowej odpwiedzi
                pytanie = scanner.nextLine();
                praw.add(pytanie);
            }
            else if(licznikLini % 8 == 7) { //wczytanie objasnienia
                pytanie = scanner.nextLine();
                wyjasnienie.add(pytanie);
            }
            else if(licznikLini %8 == 0) {
                pytanie = scanner.nextLine();
            }
            else {
                String scalonePytanie;
                scalonePytanie = scanner.nextLine();
                pytanie = scanner.nextLine();
                scalonePytanie += "\n" + pytanie;
                pytanie = scanner.nextLine();
                scalonePytanie += "\n" + pytanie;
                pytanie = scanner.nextLine();
                scalonePytanie += "\n" + pytanie;
                odp.add(scalonePytanie);
                licznikLini += 3;
            }
            licznikLini++;
        }
    }

    public ArrayList<String> getPytania() {
        return pyt;
    }

    public ArrayList<String> getOdpowiedzi() {
        return odp;
    }

    public ArrayList<String> getPrawidlowe() {
        return praw;
    }
    public ArrayList<String> getObjasnienia() {
        return wyjasnienie;
    }

}
