//package org.howard.edu.assignment2;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Combinations combo = new Combinations();
        ArrayList<ArrayList<Integer>> my_answer = new ArrayList<ArrayList<Integer>>();
        int sum1 = 15;
        int sum2 = 6;
        int sum3 = 15;
        int sum4 = 16;

        combo.compute(my_answer, new int[]{5, 5, 15, 10}, new ArrayList<Integer>(), sum1, 0);
        if (my_answer.isEmpty()) {
            System.out.print("Input: [5, 5, 15, 10] Sum:" + sum1);
            System.out.println("Combinations:");
        } else {
            System.out.println("Input: [5, 5, 15, 10] " + "Sum: " + sum1);
            System.out.println("Combinations:");
            combo.output_answers(my_answer);
            my_answer.clear();
        }


        combo.compute(my_answer, new int[] {1,2,3,4,5,6}, new ArrayList<Integer>(), sum2, 0);
        if (my_answer.isEmpty()) {
            System.out.println("Input:[1,2,3,4,5,6] " + "Sum: " + sum2);
            System.out.println("Combinations:");
        } else {
            System.out.println("Input:[1,2,3,4,5,6] " + "Sum: " + sum2);
            System.out.println("Combinations:");
            combo.output_answers(my_answer);
            my_answer.clear();
        }


        combo.compute(my_answer, new int[] {}, new ArrayList<Integer>(), sum3, 0);
        if (my_answer.isEmpty()) {
            System.out.println("Input:[] " + "Sum: " + sum3);
            System.out.println("Combinations:");
            System.out.println();
        } else {
            System.out.println("Input:[] " + "Sum: " + sum3);
            System.out.println("Combinations:");
            combo.output_answers(my_answer);
            my_answer.clear();
        }


        combo.compute(my_answer, new int[] {1,2,3,4,5}, new ArrayList<Integer>(), sum4, 0);
        if (my_answer.isEmpty()) {
            System.out.println("Input:[1,2,3,4,5] " + "Sum: " + sum4);
            System.out.println("Combinations:");
        } else {
            System.out.println("Input:[1,2,3,4,5] " + "Sum: " + sum4);
            System.out.println("Combinations:");
            combo.output_answers(my_answer);
            my_answer.clear();
        }

    }
}