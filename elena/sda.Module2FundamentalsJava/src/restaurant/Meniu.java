package restaurant;

public class Meniu {
    private String[] meniuItems;
    public double[] preturi;

    public Meniu(String[] meniuItems, double[] preturi) {
        this.meniuItems = meniuItems;
        this.preturi = preturi;
    }

    public boolean contineTipMancare(String tipMancare) {
        for (String item : meniuItems) {
            if (item.equals(tipMancare)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("meniu: ");
        for(int i = 0; i < meniuItems.length; i++){
            sb.append(meniuItems[i]+ " " + preturi[i] + " RON ");
        }

        return sb.toString();
    }
}
