package com.infoshareacademy.homeworks;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GradeService {

    public String[][] calculateAverage(String[][] data) {
        String[][] newData = data;
        String[][] nullEmptyData = {{}};     //shouldReturnEmptyArrayWhenInputIsNull OK
        if (data == null) {
            return nullEmptyData;
        }

        if (data.length == 0) {          //shouldReturnEmptyArrayWhenInputIsEmpty
            return nullEmptyData;
        }
        final DecimalFormat df = new DecimalFormat("#.00");

            for (int i = 0; i < data.length; i++) {
                data[i][1] = df.format(Double.valueOf(data[i][1]));
                data[i][1] = data[i][1].replace(',', '.');
            }






            Arrays.sort(data, new Comparator<String[]>() {
                @Override
                public int compare(final String[] first, final String[] second) {
                    return String.valueOf(first[0]).compareTo(
                            String.valueOf(second[0])
                    );
                }
            });
            return data;
    }
}
