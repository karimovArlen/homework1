package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(goTo(35, 26));
        System.out.println(goTo(16, 27));
        System.out.println(goTo(36, 34));
        System.out.println(goTo(18, 27));
        System.out.println(goTo(13, 26));

    }

    public static String goTo(int age,int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять1";
        else if (age < 20 && temp > 0 &&  temp< 28)
             return "Можно идти гулять2";
         else if (age > 45 && temp > -10 && temp < 25)
             return "Можно идти гулять3";
         else return "Оставайтесь дома";
    }
}
