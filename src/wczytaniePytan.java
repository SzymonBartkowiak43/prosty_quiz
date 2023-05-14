import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class wczytaniePytan {
    private  ArrayList<String> pyt = new ArrayList<String>();

    public void wczytaj() throws FileNotFoundException {
        File file = new File("pytania.txt");
        Scanner scanner = new Scanner(file);
        int licznikLini = 0;
        String pytanie;

        while (scanner.hasNext()) {
            pytanie = scanner.nextLine();
            if(licznikLini % 7 == 0) {
                pyt.add(pytanie);
            }
            licznikLini++;
        }
    }

    public ArrayList<String> getPytania() {
        return pyt;
    }
}
