package PraktikumDaspro13;

import java.util.Scanner;

public class caseStudy113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int pricePerCup = 18000;
    int numberOfCups, amountPaid;
    int totalPrice, discount = 0, finalPayment;
    int change, balanceDue;

    System.out.println("Enter the number of cups: ");
    numberOfCups = scanner.nextInt();
    System.out.println("Enter the amount paid: ");
    amountPaid = scanner.nextInt();

    totalPrice = pricePerCup * numberOfCups;

    if (totalPrice > 100000) {
        discount = totalPrice * 10 / 100; 
    }

    finalPayment = totalPrice - discount;

    System.out.println("Total Price: Rp " + totalPrice);
    System.out.println("Discount: Rp " + discount);
    System.out.println("Final Payment: Rp " + finalPayment);

    if (amountPaid >= finalPayment) {
        change = amountPaid - finalPayment;
        System.out.println("Change: Rp " + change);
    } else {
        balanceDue = finalPayment - amountPaid;
        System.out.println("Balance Due: Rp " + balanceDue);
    }
}
}