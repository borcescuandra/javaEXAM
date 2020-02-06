
import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.*;

public class DemoPersoane {

    public static void main(String[] args) {

        ArrayList <Persoane> persoane = new ArrayList<Persoane>();

        try{

            File fisier = new File("proba.txt");
            FileReader fr = new FileReader(fisier);
            BufferedReader citirefisier = new BufferedReader(fr);

            File fisieriesire = new File("iesire.txt");
            FileWriter fwiesire = new FileWriter(fisieriesire);
            BufferedWriter scrierefisier = new BufferedWriter(fwiesire);



            String liniecitita = "";
            String[] atribute; //linie de coloane
            citirefisier.readLine();



            while((liniecitita = citirefisier.readLine()) != null)
            {
                atribute = liniecitita.split(" ");   // citeste pana la " "
                Persoane pers =  new Persoane(Integer.parseInt(atribute[0]) //index
                        , atribute[1], // nume
                        atribute[2],  //prenume
                        Integer.parseInt(atribute[3]));
                //varsta
                persoane.add(pers);
            }




            Collections.sort(persoane, new  Comparator<Persoane>() {
                @Override
                public int compare(Persoane a, Persoane b) {
                    if(a.varsta < b.varsta)
                        return 1;
                    else
                        return -1;
                }
            });

            System.out.println(persoane);
            scrierefisier.write(String.valueOf(persoane));
            scrierefisier.flush();
            scrierefisier.close();
        }

        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }




}
