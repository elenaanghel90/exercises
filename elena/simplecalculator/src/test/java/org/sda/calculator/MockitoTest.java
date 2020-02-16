package org.sda.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
    @Mock
    public Calculator mock;
    Calculator target = new Calculator();
    Calculator spyCalculator = spy(target);

    @Before
    public void setUp() {
        when(mock.add(anyInt(), anyInt())).thenReturn(0); //0 valoare hardocdata

        when(spyCalculator.subtract(anyInt(), anyInt())).thenReturn(1);
        when(spyCalculator.add(anyInt(), anyInt())).thenReturn(1000);
    }

    @Test
    public void a_test() {
        //assert result = mock.add(12,2).thenReturn(0); e acelasi lucruri ca urm 2 randuri
        int result = mock.add(12, 2);
        assert result == 0;

        verify(mock).add(anyInt(), anyInt());
        //echivalent cu verify(mock, times(1)).add(anyInt(),anyInt());

    }

    @Test
    public void b_test() {
        verify(mock, times(0)).add(anyInt(), anyInt());
        //echivalent
        verify(mock, never()).add(anyInt(), anyInt());

        mock.add(1, 2);
        mock.add(1, 2);
        mock.add(1, 2);
        mock.add(1, 2);

        verify(mock, atLeast(1)).add(anyInt(), anyInt());
        //echivalent
        verify(mock, atLeastOnce()).add(anyInt(), anyInt());

        verify(mock, atMost(4)).add(anyInt(), anyInt());
    }
        @Test
        public void c_test () {
        int subtractResult = spyCalculator.subtract(12,1);
        int addResult = spyCalculator.add(1,10);

        assertEquals(1,subtractResult);
        assertEquals(1000,addResult);

        }

    }

