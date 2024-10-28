package com.kodilla;

public class Zadanie3 {
    public static void main(String[] args){
        String a=noName();
        int one=school();
        boolean b=house();
        int dzialanie=mnozenie(1000);
        System.out.println(dzialanie);



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
}
