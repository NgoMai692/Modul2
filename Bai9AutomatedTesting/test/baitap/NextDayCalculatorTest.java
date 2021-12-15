package baitap;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("findNextDay 01-01-2018")
    void findNextDay01012018(){
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = NextDayCalculator.findNextDay(1,1,2018);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("findNextDay 31-01-2018")
    void findNextDay31012018(){
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = NextDayCalculator.findNextDay(31,1,2018);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("findNextDay 30-04-2018")
    void findNextDay30042018(){
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";

        String result = NextDayCalculator.findNextDay(30,4,2018);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("findNextDay 28-02-2018")
    void findNextDay28022018(){
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";

        String result = NextDayCalculator.findNextDay(28,2,2018);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("findNextDay 29-02-2020")
    void findNextDay29022020(){
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";

        String result = NextDayCalculator.findNextDay(29,2,2020);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("findNextDay 31-12-2018")
    void findNextDay31122018(){
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";

        String result = NextDayCalculator.findNextDay(31,12,2018);
        assertEquals(expected, result);
    }
}
