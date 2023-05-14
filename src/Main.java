import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wyb;
        ArrayList<String> pytania = new ArrayList<String>();


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