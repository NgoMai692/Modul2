package baitap.triangleclassifier;

import baitap.nextdaycaculator.NextDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class TriangleClassifierTest {
    @Test
    @DisplayName("tam giác đều")
    public void triangleClassifier1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;

        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleClassifier(2, 2, 2);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("tam giác cân")
    public void triangleClassifier2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;

        String expected = "Tam giác cân";
        String result = TriangleClassifier.triangleClassifier(2, 2, 3);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("tam giác thường")
    public void triangleClassifier3() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String expected = "Tam giác thường";
        String result = TriangleClassifier.triangleClassifier(3, 4, 5);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Không phải là tam giác")
    public void triangleClassifier4() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;

        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.triangleClassifier(8, 2, 3);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Không phải là tam giác")
    public void triangleClassifier5() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;

        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.triangleClassifier(-1, 2, 1);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Không phải là tam giác")
    public void triangleClassifier6() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;

        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.triangleClassifier(0, 1, 1);
        assertEquals(expected, result);

    }
}