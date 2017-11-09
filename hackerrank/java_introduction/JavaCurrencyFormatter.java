﻿
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en","IN");


        NumberFormat usa=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in=NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat ch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = usa.format(payment);
        String india = in.format(payment);
        String china = ch.format(payment);
        String france = fr.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}