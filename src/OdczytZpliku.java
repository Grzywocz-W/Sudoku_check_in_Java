import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class OdczytZpliku {
    OdczytZpliku() {}
    public int[] odczytajZpliku(String nazwa_pliku){
        try(BufferedReader input = new BufferedReader(new FileReader(nazwa_pliku, StandardCharsets.UTF_8))){
            int[] liczby=new int[81];
            int indeks=0;
            int i=0;
            String linia;
            while ((linia = input.readLine()) != null) {
                linia=linia.trim();
                if(linia.isEmpty()) {
                    continue;
                }
                String[] liczbyWlini=linia.split(" ");

                if(liczbyWlini.length != 9){
                    System.out.println("Blad: Nie ma 9 cyfr w kazdej linii");
                    return null;
                }
                indeks += liczbyWlini.length;
                if (indeks > 81){
                    System.out.println("Blad: w pliku jest za duzo (ponad 81) liczb");
                    return null;
                }
                i=indeks-liczbyWlini.length;
                for(String l: liczbyWlini) {
                    liczby[i] = Integer.parseInt(l);
                    if(liczby[i]<1 || liczby[i]>9){
                        System.out.println("Blad: Podano liczbe ktora nie miesci sie w zakresie 1-9.");
                        return null;
                    }
                    i++;
                }
            }
            input.close();
            if(i==81) {
                return liczby;
            }
            else{
                System.out.println("W pliku jest mniej niz 81 liczb.");
                return null;
            }
        }
        catch(FileNotFoundException e1){
            System.out.println("Plik nie zostal znaleziony.");
            return null;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }
}
