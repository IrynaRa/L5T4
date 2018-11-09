package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> Chusla = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            Chusla.add(i);

        }

        System.out.println(Chusla);


        List<Integer> Chusla2 = new ArrayList<>();
        Integer c = 0;
        int counter =0;
        for (int i = 0; i < Chusla.size(); i++) {
            c = Chusla.get(i);
            if (c % 3 == 0) {
                counter++;

            }
        }
            System.out.println("Кількість чисел кратних на 3 :" + counter);
        }

    }

