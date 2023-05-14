import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int wyb;

        ArrayList<String> pytania = new ArrayList<String>();
        ArrayList<String> odpowiedzi = new ArrayList<String>();
        ArrayList<String> prawidlowe = new ArrayList<String>();
        ArrayList<String> objasnienie = new ArrayList<String>();

        wczytaniePytan wcz = new wczytaniePytan();

        wcz.wczytaj();
        pytania = wcz.getPytania();
        odpowiedzi = wcz.getOdpowiedzi();
        prawidlowe = wcz.getPrawidlowe();
        objasnienie = wcz.getObjasnienia();




        System.out.println("Witaj w moim quizie!");
        System.out.println("Na ile pytań chcesz odpowiedzieć? (1-10)");

        do {
            wyb = sc.nextInt();
            if(wyb < 0 || wyb > 10) {
                System.out.println("Podales liczbe poza zakresem, sprobuj jeszcze raz");
            }
        }while((wyb < 0 || wyb > 10));

        int liczbaZadanychPytan;
        int liczbaPrawidlowychOdpowedzi = 0;
        int losowePytanie;
        String odpwiedzUzytkownika;
        Random random = new Random();
        odpwiedzUzytkownika = sc.nextLine(); //wylapanie entera
        HashSet<Integer> czyWystapilopytanie = new HashSet<>();

        for(liczbaZadanychPytan = 0; liczbaZadanychPytan < wyb ;liczbaZadanychPytan++) {
            do {
                losowePytanie = random.nextInt(10);
            }while(czyWystapilopytanie.contains(losowePytanie));
            czyWystapilopytanie.add(losowePytanie);

            System.out.println(pytania.get(losowePytanie));
            System.out.println(odpowiedzi.get(losowePytanie));
            odpwiedzUzytkownika = sc.nextLine();

            if(odpwiedzUzytkownika.equalsIgnoreCase(prawidlowe.get(losowePytanie))) {
                System.out.println("Gratulacje prawidlowa odpwoiedz!");
                liczbaPrawidlowychOdpowedzi ++;
            }
            else {
                System.out.println("Niestety twoja odpowiedz jest bledna ;/, prawdilowa odpowiedz to: ");
                System.out.println(prawidlowe.get(losowePytanie));
                System.out.println(objasnienie.get(losowePytanie));
            }
        }

        System.out.println("Udalo Ci sie odpowiedziec na  " + liczbaPrawidlowychOdpowedzi + " z " + wyb + " zadanych pytan");



    }
}