package com.sdacademy.bucharest.group4;

public class Main {
    public static void main(String[] args) {
        Classroom myClassroom = new Classroom ("Mendeleev", "D" , 18);

        System.out.println("Am curs la adresa: " + myClassroom.getAddress() + " la sala: " + myClassroom.getId());

        Classroom otherClassroom = new Classroom("Mendeleev", "C", 12);

        System.out.println("Numarul de locuri din sala este = " + otherClassroom.getPlaces());

        otherClassroom.setPlaces(15);
        System.out.println("Noul numar de locuri din sala este = " + otherClassroom.getPlaces());

    }
}
