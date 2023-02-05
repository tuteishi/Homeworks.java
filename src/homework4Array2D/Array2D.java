package homework4Array2D;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array2D {
    Random random = new Random();
    private String[][] array2D = new String[10][10];
    private String[] diagonals = new String[20];
    private double[] diagonalsToNumber = new double[6];
    private int[] rounding = new int[6];

    private String generateNumbers() {
        String number = String.valueOf(Math.random() * 10).substring(0, 7);
        return number;
    }

    private String generateLetters() {
        String word = String.valueOf((char) (random.nextInt(26) + 'A'));
        for (int i = 0; i < 6; i++) {
            if (i == 3) {
                String letter = String.valueOf((char) (random.nextInt(26) + 'A'));
                word = word + letter;
            } else {
                String letter = String.valueOf((char) (random.nextInt(26) + 'a'));
                word = word + letter;
            }
        }
        return word;
    }

    private void generaitArray2D() {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                if (j == 2) {
                    array2D[i][j] = generateNumbers();
                } else if (j == 5) {
                    array2D[i][j] = generateNumbers();
                } else if (j == 8) {
                    array2D[i][j] = generateNumbers();
                } else
                    array2D[i][j] = generateLetters();
            }
        }
    }

    private void diagonals() {
        generaitArray2D();
        System.out.println();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                if (i == j) {
                    if (array2D[i][j] == array2D[array2D.length - 1 - i][j]) {
                        System.out.println(array2D[i][j] + "=" + array2D[array2D.length - 1 - i][j]);
                    } else {
                        System.out.println(array2D[i][j] + " != " + array2D[array2D.length - 1 - i][j]);
                    }
                }
            }
        }
    }

    private void diagonalsInNewArray() {
        generaitArray2D();
        int k = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                if (i == j) {
                    diagonals[k] = array2D[i][j];
                    k++;
                    diagonals[k] = array2D[array2D.length - 1 - i][j];
                    k++;
                }
            }
        }
    }

    private void diagonalsArrayOperations() {
        diagonalsInNewArray();
        System.out.println();
        for (int i = 0; i < diagonals.length; i++) {
            StringBuilder sb = new StringBuilder(diagonals[i]);
            Pattern pattern = Pattern.compile("^[a-zA-Z]{7}");
            Matcher matcher = pattern.matcher(diagonals[i]);
            int k = 0;
            while (matcher.find()) {
                System.out.println(diagonals[i].substring(matcher.start(), matcher.end()));
                sb.insert(2, ',');
                sb.insert(4, ',');
                String light = sb.substring(1, 6);
                System.out.println(light);
            }
        }
        System.out.println();
            for (int i = 0; i < diagonals.length; i++) {
            Pattern pattern = Pattern.compile("^[0-9]*[.,][0-9]+$");
            Matcher matcher = pattern.matcher(diagonals[i]);
            int k = 0;
            while (matcher.find()) {
                diagonalsToNumber[k] = Double.parseDouble(diagonals[i].substring(matcher.start(), matcher.end()));
                if (diagonalsToNumber[k] <= 1.7) {
                    rounding[k] = (int) Math.floor(diagonalsToNumber[k]);
                }else {
                    rounding[k] = (int) Math.ceil(diagonalsToNumber[k]);
                      }
                System.out.print(rounding[k] + "_");
                k++;
            }
        }
        System.out.println();
    }

    public  void showTasks () {
        diagonalsArrayOperations();
        System.out.println("\n" + "Matrix 10*10 :" + "\n");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                System.out.print(array2D[i][j] + " | ");
            }
            System.out.println();
        }
    }
}