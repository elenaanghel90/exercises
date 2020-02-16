package calculator;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class CalculatorTest {

    Calculator target = new Calculator();
    @Rule
   public ExpectedException expectException = ExpectedException.none();


    @BeforeClass //daca vrem sa apara decat o singura data, comparativ cu @before si metoda trebuie sa fie statica
    public static void beforeClass() {
        System.out.println("Inaintea tuturor testelor");
    }

    @Before
    public void setup() {
        System.out.println("Inaintea fiecarui test");
    }

    @Ignore("Testele pica deoarece s-a modificat functionalitatea") //dezactivare teste imediat urmatore, adica doar testul de dupa si este recomandat sa scriem un mesaj
    @Test
    public void testMembers() {
        assertEquals(true, target.isActive);
        assertTrue(target.isActive);//similar cu asseetEquals, doar ca introduci ca parametrii target.isActive,dar mai simplificat
        //assertTrue("Target in not true", !target.isActive);

        String[] verificare = {"add", "subtract"};
        assertArrayEquals(new String[] {"add", "subtract"},target.methods);
    }



    @Test
    public void testAdd() {
        assert 5 == 5;//verifica daca 8 este egal cu 5
        //java style
        assert target.add(1, 2) == 3;

        //junit style
        assertEquals(3, target.add(1, 2));//dam ca parametri valoarea pe care ne asteptam sa o primim si valorile pe care vrem sa le testam; Assert.assertEquals este similar cu assert de mai inainte, doar ca format JUnit
        //assertEquals("Rezultatul nu este cel dorit", 4, target.add(1, 2));//punem mesaj in general ca sa vedem ca nu sa bine, apare ca mesaj in eroare la rulare
    }

    @Test
    public void testConstructor() {
        Object obiect = null;

        assertNotNull(target);
        //assertNotNull("Obiectul nu este initializat", obiect);

        assertNull(obiect);

    }
    @Test
    public void testSubtract(){
        assertEquals(1,target.subtract(3,2));

        //assertEquals("Rezultatul nu este cel dorit",2,target.subtract(3,2));
    }


    @Test
    public void testMultiply(){
        assertEquals(6,target.multiply(3,2));
        //assertEquals("Rezultatul nu este cel dorit",5,target.multiply(2,3));
    }
    @Test
    public void testDivide() {
        assertEquals(2, target.divide(6, 3));

        expectException.expect(ArithmeticException.class);
        expectException.expectMessage("/ by zero"); //mesajul trebuie sa fie scris identic ca cel pe care il afiseaza in eroare
        target.divide(100, 0);
        //assertEquals("Rezultatul este cel dorit",4,target.divide(6,3));
    }

    @Test(expected = ArithmeticException.class) //alta varianta de a afisa exceptia
    public void testDivideShouldThrow(){
        target.divide(100,0);
    }

    @Test
    public void divisionByZero(){
        target.divisionByZero(12,3);
        //target.divisionByZero(12,0);
    }

    @Test(timeout = 100L)//daca ruleaza mai mult de 100 milisecunde inseamna ca testul nu functioneaza cum tebuie, pentru ca noi ne-am propus sa dureze 100 milisec; e posibil de exemplu sa fie o greseala de loop infinit si trebuie sa iti dea un timeout
    public void testTimeout() throws InterruptedException {
        Thread.sleep(1000L); //metoda nostra dorame 1000 milisecunde
        System.out.println("In afara metodei sleep()");
    }

    @Test(timeout = 1000L, expected = NullPointerException.class)
    public void testBothTestParams() throws InterruptedException {
        Thread.sleep(1000L); //metoda nostra dorame 1000 milisecunde
        System.out.println("In afara metodei sleep()");
        throw new NullPointerException();
    }
    @After
    public void breakdown() {
        System.out.println("Dupa fiecare test");
    }

    @AfterClass //daca vrem sa apara decat o singura data dupa toate testele, comparativ cu @after si metoda trebuie sa fie statica
    public static void afterClass() {
        System.out.println("Dupa incheierea tuturor testelor");
    }

}
