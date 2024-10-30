package com.kodilla;

public class Zadanie3 {
    public static void main(String[] args){
int wynik=dodawanie(5,10);
System.out.println(wynik);
wynik=dodajTrzy(12);
System.out.println(wynik);
wynik=dodajTrzy(213);
System.out.println(wynik);

wynik=dodajTrzy(wynik);


System.out.println(wynik);
    }
    private static String noName(){
        String text="Kaja";
        return text;

    }
    private static int school(){
        int number=1;
        return number;

    }
    private static boolean house(){
        boolean h=true;
        return h;
    }
    private static int mnozenie1(){
        int wynik=2*5;
        return wynik;
    }
    private static int mnozenie2(){
        int wynik=2*6;
        return wynik;

    }
    private static int mnozenie3(){
        int wynik=2*7;
        return wynik;
    }
    private static int mnozenie4(){
        int wynik=2*8;
        return wynik;

    }
    private static int mnozenie(int drugaCyfra){
        int wynik=2*drugaCyfra;
        return wynik;
    }
    static int dodajTrzy(int cyfra) {
        int wynik = cyfra + 3;
        return wynik;

    }
    static int dodajCztery(int cyfra){
        int wynik=cyfra + 4;
        return wynik;

    }
    static int praca(int cyfra){
        int wynik=cyfra-5;
        return wynik;



        }
        static int dodawanie(int a, int b){
        int wynik=a+b;
        return wynik;
        }
    }
