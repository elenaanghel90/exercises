package Threads;

public class Action {
    public enum TYPE{
        FILTER_BY_YEAR,
        WON_BY_ATTACKER
    }
    private TYPE type;
    private Integer year;

    public TYPE getType() {
        return type;
    }

   public Integer getYear() {
        return year;
    }
    public Action(TYPE type){
        this(type, null);
    }
    public Action(TYPE type, Integer year)
    {
        this.type = type;
        this.year = year;
    }


}
