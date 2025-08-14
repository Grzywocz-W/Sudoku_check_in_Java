import java.util.ArrayList;
import java.util.Arrays;

public class SprawdzanieMalychKwadratow {
    int malyKw;
    SprawdzanieMalychKwadratow(){
        this.malyKw=0;
    }
    public ArrayList<String> sprawdzMaly(int num, int[] liczby){
        this.malyKw=num;
        int[] sprawdzane=new int[9];
        int[] checkList=new int[9];
        ArrayList<String>listaBledow=new ArrayList<>();
        int licznik=0;
        int indeks=0;
        int[] sprawdzajaca=new int[9];

        switch (malyKw){
            case 1:
                //Wczytanie pierwszego kwadratu
                licznik=0;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;



            case 2:
                //Wczytanie drugiego kwadratu
                licznik=3;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 3:
                //Wczytanie trzeciego kwadratu
                licznik=6;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 4:
                //Wczytanie czwartego kwadratu
                licznik=27;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 5:
                //Wczytanie piatego kwadratu
                licznik=30;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 6:
                //Wczytanie szostego kwadratu
                licznik=33;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 7:
                //Wczytanie siodmego kwadratu
                licznik=54;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 8:
                //Wczytanie osmego kwadratu
                licznik=57;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;


            case 9:
                //Wczytanie dziewiatego kwadratu
                licznik=60;
                indeks = 0;
                for (int j = licznik; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }
                licznik+=9;
                for (int j =licznik ; j <= licznik+2; j++) {
                    sprawdzane[indeks] = liczby[j];
                    indeks++;
                }

                //Sprawdzanie danego kwadratu:
                Arrays.fill(checkList,0);
                for(int l: sprawdzane) {
                    checkList[l-1]++;
                }
                Arrays.fill(sprawdzajaca,1);
                if (Arrays.equals(checkList,sprawdzajaca)==false) {
                    listaBledow.add("Blad w "+(malyKw)+" malym kwadracie sudoku");
                }
                break;

        }

        //Jesli wystapily bledy zapisujemy informacje o nich
        if(listaBledow.size()!=0) {
            return listaBledow;
        }
        else {
            return null;
        }
    }
}
