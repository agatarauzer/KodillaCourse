package com.kodilla.words;

public class App {
    public static void main (String[] args) {

        MyWords wordsWithALetter = new MyWords();
        wordsWithALetter.addWords(50, 'a');

        wordsWithALetter.splitIntoEvenAndOdd();

        wordsWithALetter.printAllWords();
        wordsWithALetter.printEvenLengthWords();
        wordsWithALetter.printOddLengthWords();
    }
}
