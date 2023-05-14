import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int wyb;
        ArrayList<String> pytania = new ArrayList<String>();

        wczytaniePytan wcz = new wczytaniePytan();
        wcz.wczytaj();
        pytania = wcz.getPytania();
   

        System.out.println("Witaj w moim quizie!");
        System.out.println("Na ile pytań chcesz odpowiedzieć? (1-10)");

        do {
            wyb = sc.nextInt();
            if(wyb < 0 || wyb > 10) {
                System.out.println("Podales liczbe poza zakresem, sprobuj jeszcze raz");
            }
        }while((wyb < 0 || wyb > 10));

    }
}