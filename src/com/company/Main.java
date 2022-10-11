package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(new FileReader("src//Text"))) {
            int symbol = 0;
            int space = 0;
            int withoutSpace = 0;
            int word = 0;
            String text = "";
            while ((symbol = fr.read()) != -1) {
                text += (char) symbol;
            }
            for(int i = 0; i<text.length(); i++){
                symbol++;
            }
            System.out.println("Количество символов: " + symbol);
            for(int i = 0; i < text.length(); i++) {
                if(Character.isWhitespace(text.charAt(i)))
                    space++;
            }

            withoutSpace = symbol - space;
            System.out.println("Количество символов без пробелов: " + withoutSpace);
            if(text.length() != 0){
                word++;
                for (int i = 0; i < text.length(); i++) {
                    if(text.charAt(i) == ' '){
                        word++;
                    }
                }
            }
            System.out.println("Количество слов: "+ word);

        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}