package PraktikumDaspro13;

import java.util.Scanner;

public class StudiKasus213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName, activityType;
        int documentCount, rank = 0, fundingStatus = 0;
        int missingDocs;

        System.out.print("Student name : ");
        studentName = scanner.nextLine();

        System.out.print("Activity type (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        activityType = scanner.nextLine();

        System.out.print("Number of documents : ");
        documentCount = scanner.nextInt();

        if (activityType.equalsIgnoreCase("BELMAWA") ||
            activityType.equalsIgnoreCase("BAKORMA") ||
            activityType.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Winner rank : ");
            rank = scanner.nextInt();

            if (rank >= 1 && rank <= 3) {
                if (documentCount == 4) {
                    System.out.println("Status : Eligible to receive award funds.");
                } else {
                    missingDocs = 4 - documentCount;
                    System.out.println("Status : Incomplete documents (" + missingDocs + " document(s) missing). Award funds are not given.");
                }
            } else {
                System.out.println("Status : Does not receive award funds (only for 1st, 2nd, or 3rd place).");
            }

        } else if (activityType.equalsIgnoreCase("PKM")) {

            System.out.print("PKM funding status (1 = funded, 0 = not funded) : ");
            fundingStatus = scanner.nextInt();

            if (fundingStatus == 1) {
                if (documentCount == 4) {
                    System.out.println("Status : Eligible to receive award funds (PKM funded).");
                } else {
                    missingDocs = 4 - documentCount;
                    System.out.println("Status : Incomplete documents (" + missingDocs + " document(s) missing). Award funds are not given.");
                }
            } else {
                System.out.println("Status : Does not receive award funds (PKM not funded).");
            }

        } else {
            System.out.println("Status : Does not receive award funds (activity type is not covered by the provisions).");
        }

        scanner.close();
    }
}