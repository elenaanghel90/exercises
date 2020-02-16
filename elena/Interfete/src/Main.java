public class Main {
    public static void main(String[] args) {
        StoragePersons sp = new BucketList();
        sp.add("123");
        sp.add("269");
        sp.add("258");
        sp.add("169");
        sp.add("158");

        System.out.println(sp);

        sp.remove("158");
        System.out.println(sp);

        System.out.println(sp.exists("258"));
        System.out.println(sp.list());
    }

}
