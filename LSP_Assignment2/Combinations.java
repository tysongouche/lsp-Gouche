import java.util.ArrayList;
//package org.howard.edu.assignment2;
public class Combinations {
    public void compute(ArrayList<ArrayList<Integer>> final_answer, int[]my_array, ArrayList<Integer> tmp, int sum,
                        int start) {
        if(start > my_array.length || sum < 0)
            return ;
        if(sum == 0) {
            final_answer.add(new ArrayList<Integer>(tmp));
            return;
        } else {
            for (int i = start; i<my_array.length; i++) {
                tmp.add(i);
                compute(final_answer, my_array, tmp, sum - my_array[i], i+1);
                tmp.remove(tmp.size()-1);
            }
        }
    }
    public void output_answers(ArrayList<ArrayList<Integer>> final_answer) {
        int n = final_answer.size();
        for(int i = 0; i<n; i++){
            int temp = final_answer.get(i).size();
            System.out.print("[");
            for(int x = 0; x<temp ; x++){
                System.out.print(final_answer.get(i).get(x));
                if(x != temp-1)
                    System.out.print(", ");
            }
            System.out.println("]");
        }
        System.out.println();
    }
}