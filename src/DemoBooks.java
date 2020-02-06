
//cititi intr-o colectie
//List <Book>
//sortati colecctia
//in ordine crescatoare utilizand rating

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoBooks {

    public static void main(String[] args) {
        ArrayList <Books> list = new ArrayList<Books>();

        String path = "C:\\Users\\andra\\Downloads\\examen (2)mih\\examen\\examen\\books.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));


            File fisieriesire = new File("iesireBookss.txt");
            FileWriter fw = new FileWriter(fisieriesire);
            BufferedWriter scrierefisier = new BufferedWriter(fw);

            br.readLine();
            String linie;
            while((linie = br.readLine()) != null) {
                //System.out.println(linie);
                if (linie.contains(", ")) {
                    continue;}
                String[] sir = linie.split(",");
                double rat = Double.parseDouble(sir[12]);
                Books carte = new Books(sir[9],sir[7],rat);
                list.add(carte);
            }

            Collections.sort(list, new  Comparator<Books>() {
                @Override
                public int compare(Books a, Books b) {
                    if(a.rating < b.rating)
                        return 1;
                    else
                        return -1;
                }
            });

            scrierefisier.write(String.valueOf(list));
            scrierefisier.flush();
            scrierefisier.close();

            for (Books b : list)
            {
                System.out.print(b);
            } }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } }

