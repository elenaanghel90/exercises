package Threads;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

//cu ajutorul librarieri trecem prin toate
public class Loader extends Thread {
    @Override
    public void run() {
        try {
            Reader in = new FileReader("battles.csv");
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);//luam capatul de coloane
            Iterator<CSVRecord> iterator = records.iterator();
            //System.out.println(iterator.next().get("Name"));

            while(iterator.hasNext()){
                CSVRecord rec = iterator.next();
                Battle battle = new Battle(rec.get("name"),
                        Integer.parseInt(rec.get("year")), //parseInt verifica fiecare cifra si o converteste
                        rec.get("attacker_1") ,
                        rec.get("defender_1"),
                        rec.get("location"),
                        rec.get("attacker_outcome").equals("win"));//aici equals intoarce true sau false, daca scrie win sau lose

               CommandReader.dataRepo.addBattle(battle);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

