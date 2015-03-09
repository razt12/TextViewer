package com.company;

public class App {

    public static void main(String[] args) {
	String text = "This is a sample test\nOne Two Three\nHello world!";
        for (int i = 0; i<text.length(); ++i){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
