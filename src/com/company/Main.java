package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền");
        double money = input.nextDouble();
        System.out.println("nhập số tháng cần gửi");
        int month = input.nextInt();
        System.out.println("Nhập lãi suất");
        double interserRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interserRate / 100) / 12 * month;
        }
        System.out.println("Tổng tiền là " + totalInterest);
    }
}
