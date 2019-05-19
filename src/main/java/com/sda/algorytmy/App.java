package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static int[] sort(int[] tab) {
        int counter = 0;
        
        for (int j = 0; j < tab.length - 1; j++) {

            boolean flaga = false;
            for (int i = 0; i < tab.length - j - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    //zamien miejscami
                    int tmp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                    flaga = true;
                }
                counter++;
            }
            if (!flaga) {
                break;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(counter);
        return tab;

    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
/*        int max = 200;
        int min = -1000;
        while (true) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println(randomNumber);
            if (randomNumber == min) {
                break;
            }
        }*/

        // stworzyc tablice o rozmiarze 10000, ktora bedzie zawierala liczby losowe z zakresu
        // -5000 do 5000
        int max = 5000;
        int min = -5000;
        int[] tab = new int[20];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < tab.length; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            tab[i] = randomNumber;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Czas wykonywania:" + totalTime);

        sort(tab);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Czas sortowania:" + totalTime);
    }


}