package person;

import java.util.ArrayList;
import java.util.List;

public class AppPersons {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Student("Anghel", "Pitesti","Chemistry", 2, 156.2));
        personList.add(new Staff("Dumitru","Bucharest", "Nr 5", 1250));
        personList.add(new Student("Ionescu", "Cluj", "Mathematics", 2, 85.2));
        personList.add(new Student("Popescu", "Iasi", "Literature", 2, 155));

        for (Person p : personList) {
            System.out.println(p);
        }
        System.out.println();

        for(Person p : personList){
            if(p instanceof Student) {
                if(((Student) p).getFee()>50){
                    System.out.println(p.getName() + " fee " + ((Student) p).getFee());

                }
            }
        }

    }
}
