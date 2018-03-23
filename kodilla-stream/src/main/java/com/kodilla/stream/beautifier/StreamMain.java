package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();
        String text = "Ala ma kota";

        beautifier.beautify(text, text1 -> System.out.println(text.toUpperCase()));

        StringBuilder builder = new StringBuilder();
        String additionalLetters = "ABC";
        beautifier.beautify(text, text1 -> System.out.println(builder.append(additionalLetters).
                append(text).append(additionalLetters).toString()));

        StringBuilder builder2 = new StringBuilder();
        String additionalChar = "***";
        beautifier.beautify(text, text1 -> System.out.println(builder2.append(additionalChar).
                append(text).append(additionalChar).toString()));

        beautifier.beautify(text, text1 -> System.out.println(text.replace(" ", "^^")));
    }
}
