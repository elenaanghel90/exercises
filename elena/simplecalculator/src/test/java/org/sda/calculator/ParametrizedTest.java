package org.sda.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    Calculator target = new Calculator();


    @Parameterized.Parameter(0)
    public int variabila1;
    @Parameterized.Parameter(1)
    public int variabila2;
    @Parameterized.Parameter(2)
    public int rezultatAsteptat;

    @Parameterized.Parameters
    public static Collection<Integer[]>data(){
        return Arrays.asList(
            new Integer[][]{
                    {1, 2, 3}, //parametrul 0 adica variabila1 = 1, parametrul 1 =2, parametrul 2 adica rezultat asteptat = 3
                    {3, 4, 7}, //parametrul 0 adica variabila1 = 3, parametrul 1 =4, parametrul 2 adica rezultat asteptat = 7
                    {16, 14, 30}, //parametrul 0 adica variabila1 = 16, parametrul 1 =14, parametrul 2 adica rezultat asteptat = 30
                    {1, 1, 30} //ar trebui sa pice, pentru ca 1 +1 nu e esgat cu 30
            }
        );
    }

    @Test
    public void testAdd(){
        int result = target.add(variabila1, variabila2);//luam doua variabile dintr-o lista data, facem o suma intre cele doua variabile
        assertEquals(rezultatAsteptat, result);//comparam rezultatul asteptat cu rezultatul obtinut
    }
}
