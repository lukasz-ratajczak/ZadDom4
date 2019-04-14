package com.infoshareacademy.homeworks;

import java.util.Arrays;
import java.util.Comparator;

public class tester {
    public static void main(String[] args) {
        final String[][] input = new String[][]{
                {"Ania", "5"},
                {"Tomek", "6"},
                {"Kasia", "3"},
                {"Albert", "2"}
        };

        GradeService gradeService = new GradeService();
        gradeService.calculateAverage(input);


    }
}