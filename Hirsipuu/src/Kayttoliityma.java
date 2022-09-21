import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayttoliityma {
    private Scanner lukija;

    public Kayttoliityma(Scanner lukija) {
        this.lukija = lukija;
    }
    public void kaynnista() throws FileNotFoundException {
        Henkilo henkilo = new Henkilo();
        Scanner scanner = new Scanner(new File("sanat.txt"));
        //Scanner lukija = new Scanner(System.in);
        List<String> sanat = new ArrayList<>();
        while (scanner.hasNext()) {
            sanat.add(scanner.nextLine());
        }
        String sana = sanat.get((int) (Math.random() * sanat.size()));

        List<Character> arvaus = new ArrayList<>();
        int vaarat = 0;
        System.out.println(sana);
        while (true) {
                     
            if (!arvaukset(lukija, sana, arvaus)) {
                System.out.println("Kirjainta ei löydy sanasta!");
                vaarat++;
            }
            if(arvaus(sana, arvaus)) {
                henkilo.oikein();
                break;
            }
            if (vaarat == 1) {
                henkilo.vaara1();
                System.out.println("Vääriä vastauksia jäljellä: " + (4 - vaarat));
                System.out.println("");
            }
            if (vaarat == 2) {
                henkilo.vaara2();
                System.out.println("Vääriä vastauksia jäljellä: " + (4 - vaarat));
                System.out.println("");
            }
            if (vaarat == 3) {
                henkilo.vaara3();
                System.out.println("Vääriä vastauksia jäljellä: " + (4 - vaarat));
                System.out.println("");
            }
            if (vaarat == 4) {
                henkilo.vaara4();
                System.out.println("Vääriä vastauksia jäljellä: " + (4 - vaarat));
                System.out.println("");
            }
            if (vaarat == 5) {
                henkilo.vaara5();
                break;
            }
        }
    }

    private static boolean arvaus(String sana, List<Character> arvaus) {
        int oikeat = 0;
        for (int i = 0; i < sana.length(); i++) {
            if (arvaus.contains(sana.charAt(i))) {
                System.out.print(sana.charAt(i));
                oikeat++;
            }
            else {
                System.out.print("?");
            }
        }
        System.out.println("");
        return (sana.length() == oikeat);
    }

    private static boolean arvaukset(Scanner lukija, String sana, List<Character> arvaus) {
        System.out.println("Syötä kirjain: ");
        String luettu = lukija.nextLine();
        arvaus.add(luettu.charAt(0));
        return sana.contains(luettu);
    }

}