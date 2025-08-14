import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            GUI gui = new GUI();
            while (gui.getPlik() == null) {
                try {
                    Thread.sleep(1000); // Czekamy, aż użytkownik poda nazwę pliku
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String plik = gui.getPlik();

            int[] liczby = new int[81];
            OdczytZpliku odczyt = new OdczytZpliku();
            liczby = odczyt.odczytajZpliku(plik);
            if(liczby==null){
                System.out.println("Zatrzymano dzialanie programu bo wystapil blad z danymi wejsciowymi.");
                throw new Exception();
            }

            ArrayList<ArrayList<String>> listaBledowSudoku = new ArrayList<>();
            ArrayList<String> komunikatyObledzie = new ArrayList<>();

            SprawdzenieDuzegoKwadratu sprawdzanieDuzego = new SprawdzenieDuzegoKwadratu();
            komunikatyObledzie=sprawdzanieDuzego.sprawdzWiersze(liczby);
            if(komunikatyObledzie != null) {
                listaBledowSudoku.add(komunikatyObledzie);
            }
            komunikatyObledzie=sprawdzanieDuzego.sprawdzKolumny(liczby);
            if(komunikatyObledzie !=null) {
                listaBledowSudoku.add(komunikatyObledzie);
            }


            SprawdzanieMalychKwadratow sprawdzanieMalych = new SprawdzanieMalychKwadratow();
            for (int i = 1; i <= 9; i++) {
                komunikatyObledzie=sprawdzanieMalych.sprawdzMaly(i, liczby);
                if(komunikatyObledzie != null) {
                    listaBledowSudoku.add(komunikatyObledzie);
                }
            }

            if (listaBledowSudoku.isEmpty()) {
                ArrayList<String> wewnetrzna = new ArrayList<>();
                wewnetrzna.add("Gratulacje rozwiazano bezblednie.");
                listaBledowSudoku.add(wewnetrzna);
            }
            ZapisDoPliku zapis = new ZapisDoPliku();
            zapis.zapisDoPliku(plik, listaBledowSudoku);

            System.out.println("Wykonano wszystkie operacje");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}