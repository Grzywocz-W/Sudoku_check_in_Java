import java.io.*;
import java.util.*;

class ZapisDoPliku {
    public ZapisDoPliku() {}
    public void zapisDoPliku(String plik, ArrayList<ArrayList<String>> listaBledow) {
        try(BufferedWriter output = new BufferedWriter(new FileWriter(plik,true))){
            output.write("\n");
            for(ArrayList<String> lista: listaBledow) {
                for(String linia: lista) {
                    output.write(linia);
                    output.newLine();
                }
            }
            output.flush();
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("Plik nie zostal znaleziony");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
