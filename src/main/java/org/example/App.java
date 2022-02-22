package org.example;

import java.util.Scanner;

import org.example.second.BankProvider;
import org.example.second.CommissionСounter;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        in.close();
        BankProvider bankProvider = new BankProvider();
        double result = bankProvider.getAllOrder(num);
        System.out.println(result);


//        Factory factory = new Factory();
//       double result = factory.getConvertor("Kelvin", 0);
//        System.out.println(result);


    }
}
