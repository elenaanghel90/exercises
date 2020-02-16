package Threads;

import java.io.Serializable;

public class Battle implements Serializable {

    private String name;
    private Integer year;
    private String attacker;
    private String defender;
    private String location;
    private Boolean attackerWon;



    public Battle(String name, Integer year, String attacker, String defender, String location, Boolean attackerWon) {
        this.name = name;
        this.year = year;
        this.attacker = attacker;
        this.defender = defender;
        this.location = location;
        this.attackerWon = attackerWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAttacker() {
        return attacker;
    }

    public void setAttacker(String attacker) {
        this.attacker = attacker;
    }

    public String getDefender() {
        return defender;
    }

    public void setDefender(String defender) {
        this.defender = defender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getAttackerWon() {
        return attackerWon;
    }

    public void setAttackerWon(Boolean attackerWon) {
        this.attackerWon = attackerWon;
    }
    @Override
    public String toString() {
        return "Battle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", attacker='" + attacker + '\'' +
                ", defender='" + defender + '\'' +
                ", location='" + location + '\'' +
                ", attackerWon=" + attackerWon +
                '}';
    }
}
