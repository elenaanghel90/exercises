package Nested;

public class Main {
    public static void main(String[] args) {


        Browser browser = new Browser();
        Tab tab1 = new Tab();
        // err -  Tab2 tab = new Tab2();
        //not an error but not ideal - Browser.Tab2 tab2 = browser.new Tab2();

        //better
        Browser.Tab2 tab2 = browser.createTab();
    }
}
