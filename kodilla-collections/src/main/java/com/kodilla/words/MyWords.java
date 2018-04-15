package com.kodilla.words;

import java.util.*;

public class MyWords {
    private Queue<String> words = new ArrayDeque<>();
    private List<String> evenLengthWords = new ArrayList<>();
    private List<String> oddLengthWords = new ArrayList<>();

    public void addWords(int numberOfWords, char character) {
        while(numberOfWords > 0) {
            words.offer(createWord(character));
            numberOfWords--;
        }
    }

    private String createWord(char character) {
        int length = new Random().nextInt(50) + 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(character);
        }
        String word = builder.toString();
        return word;
    }

    public void splitIntoEvenAndOdd() {
        for (String word : words) {
            if (word.length() % 2 == 0) {
                evenLengthWords.add(word);
            }
            else {
                oddLengthWords.add(word);
            }
        }
    }

    public void printAllWords() {
        System.out.println("ALL WORDS: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void printEvenLengthWords() {
        System.out.println("EVEN LENGTH WORDS: ");
        for (String word : evenLengthWords) {
            System.out.println(word);
        }
    }

    public void printOddLengthWords() {
        System.out.println("ODD LENGTH WORDS: ");
        for (String word : oddLengthWords) {
            System.out.println(word);
        }
    }
}
