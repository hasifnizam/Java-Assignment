package com.example;

import java.util.List;

public class Count {
    
    public static void Counter(List<String> elements){

        System.out.println("\nStarting the counter function....");

        String[] array = new String[elements.size()];
        
        int total = 0;

        for (int i = 0; i < elements.size(); i ++){

            total += 1;
            array[i] = elements.get(i);
   
            System.out.println(total + ") " + array[i]);
        }

        System.out.println("\nNumber of words: " + total + "\n");
    }

}
