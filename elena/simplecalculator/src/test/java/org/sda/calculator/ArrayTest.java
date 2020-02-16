package org.sda.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;


public class ArrayTest {

    public String[] strings = {"abc", "cde", "efg"};

    @Test
    public void testArray(){
        assertEquals(strings.length,3);
        assertThat(strings).hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}
