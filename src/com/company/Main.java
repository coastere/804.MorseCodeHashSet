package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] words = {"gin", "zen", "gig", "msg"};
        String [] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniq = new HashSet<>();

        for (String str:words) {
            StringBuilder transformed = new StringBuilder();
            for (char c :str.toCharArray()) {
                transformed.append(code[c - 'a']);
            }
            uniq.add(transformed.toString());
        }

        System.out.println(uniq.size());

    }
}
