import java.util.ArrayList;
import java.util.Arrays;

public class SprawdzenieDuzegoKwadratu {
    SprawdzenieDuzegoKwadratu(){}
    public ArrayList<String> sprawdzWiersze(int[] liczby){
        int[] sprawdzane=new int[9];
        int[] checkList=new int[9];
        ArrayList<String>listaBledow=new ArrayList<>();
        int licznik=0;

        for(int i=0;i<9;i++) {
            //Wczytanie jednego wiersza
            int indeks = 0;
            for (int j = licznik; j < licznik + 9; j++) {
                sprawdzane[indeks] = liczby[j];
                indeks++;
            }
            licznik += 9;

            //Sprawdzanie danego wiersza:
            Arrays.fill(checkList,0);
            for(int l: sprawdzane) {
                checkList[l-1]+=1;
            }
            int[] arr={1,1,1,1,1,1,1,1,1};
            if (Arrays.equals(checkList,arr)==false) {
                listaBledow.add("Blad w "+(i+1)+" duzym wierszu sudoku");
            }
        }
        if(listaBledow.size()!=0) {
            return listaBledow;
        }
        else {
            return null;
        }
    }

    public ArrayList<String> sprawdzKolumny(int[] liczby){
        int[] sprawdzane=new int[9];
        int[] checkList=new int[9];
        ArrayList<String>listaBledow=new ArrayList<>();
        int licznik=0;

        for(int i=0;i<9;i++) {
            //Wczytanie jednej kolumny
            int indeks = 0;
            for (int j = licznik; j <= (licznik + 8*9); j+=9) {
                sprawdzane[indeks] = liczby[j];
                indeks++;
            }
            licznik += 1;

            //Sprawdzanie danej kolumny:
            Arrays.fill(checkList,0);
            for(int l: sprawdzane) {
                checkList[l-1]+=1;
            }
            int[] arr={1,1,1,1,1,1,1,1,1};
            if (Arrays.equals(checkList,arr)==false) {
                listaBledow.add("Blad w "+(i+1)+" duzej kolumnie sudoku");
            }
        }
        if(listaBledow.size()!=0) {
            return listaBledow;
        }
        else {
            return null;
        }
    }
}
