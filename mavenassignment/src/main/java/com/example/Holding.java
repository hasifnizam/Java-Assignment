package com.example;

import java.util.Arrays;
import java.util.List;

public class Holding {

    public void StartHold(String fullText)
    {
        System.out.println("\nStarting the holding function....");

        List<String> text = Arrays.asList(fullText.split(" "));
        
        System.out.println(text.toString());

        Count.Counter(text);
    }
    
}
