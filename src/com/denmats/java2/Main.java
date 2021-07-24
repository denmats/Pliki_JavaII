package com.denmats.java2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Assignment 1: Wczytaj dane z pliku tekstowego dane1.txt i wyświetl je na ekranie.");
        Assignment1 a1 = new Assignment1("C:\\Users\\matsuied\\Desktop\\dane1.txt");
        a1.displayFile();
        System.out.println("Assignment 2: W pliku dane1.txt znajdują się liczby typu int. " +
                "Napisz program, który wczyta dane z pliku i wyświetli ich sumę.");
        Assignment2 a2 = new Assignment2("C:\\Users\\matsuied\\Desktop\\dane1.txt");
        a2.displaySumOfNumbers();
        System.out.println("Assignment 3: " +
                "czytaj w całości zawartość pliku dane1.txt i wyświetl go na ekranie " +
                "(nie używając do tego pętli i podejścia sekwencyjnego wprowadzania danych");
        Assignment3 a3 = new Assignment3();
        a3.readFileAtOnce();
        System.out.println("Assignment 4: " +
                "W pliku napis.txt znajduje się ponad 1000 wierszy. " +
                "Napisz program wczytujący wiersz tekstu rozpoczynający się od pozycji 15464. " +
                "Program nie powinien wykorzystywać pętli, ale przenieść wskaźnik pliku do podanego w nim miejsca.");
        Assignment4 a4 = new Assignment4();
        a4.randomFileAccess();
    }
}
