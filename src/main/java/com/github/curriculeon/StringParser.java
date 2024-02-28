package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if(input == null) return null;
        Character[] characters = new Character[input.length()];
        char[] chars = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
            characters[i] = chars[i];
        }
        return characters;
    }

    public static Integer[] parseIntegers(String input) {
        if(input == null) return null;

        ArrayList<Integer> integers = new ArrayList<>();
        String[] strings = input.split("");
        for(int i = 0; i < input.length(); i++){
            if(strings[i].equals(" ")) continue;
            integers.add(Integer.parseInt(strings[i]));
        }
        Integer[] result = integers.toArray(new Integer[integers.size()]);
        return result;
    }

    public static List<String> toList(String[] input) {
        return null;
    }

    public static String[] parseStrings(String input) {
        return null;
    }
}
