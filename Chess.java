package com.company;
import java.util.Scanner;

public class Chess {

    public static void main() {
        final int RIGHT_BORDER = 8, LEFT_BORDER=1,UP_BORDER=1,DOWN_BORDER=8;
        String name1 = "",name2 = ""; // restore player name as a string
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the type" + " of the first chessman");
        char first = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row1 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col1 = scan.nextInt();
        System.out.println("Please enter the type" + " of the second chessman");
        char second = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row2 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col2 = scan.nextInt();

        switch (first) {
            case 'b':
                name1 = "bishop";
                break;
            case 'r':
                name1 = "rook";
                break;
            case 'k':
                name1 = "knight";
                break;
        }
        switch (second) {
            case 'b':
                name2 = "bishop";
                break;
            case 'r':
                name2 = "rook";
                break;
            case 'k':
                name2 = "knight";
                break;
        }

        if (first == second) { //check if chessmen is the same
            System.out.println("Chessmen should be different from each other");
        } else if ((row1 < UP_BORDER || row1 > DOWN_BORDER) || (col1 < LEFT_BORDER || col1 > RIGHT_BORDER)) { //check illegal position first player
            System.out.println("Position is not legal");
        } else if ((row2 < UP_BORDER || row2 > DOWN_BORDER) || (col2 < LEFT_BORDER || col2 > RIGHT_BORDER)) { //check illegal position second player
            System.out.println("Position is not legal");
        } else if ((row1 == row2) && (col1 == col2)) {
            System.out.println("Chessmen positions should not be identical");

        }

        // If bishop check that other tool is diagonal to bishop
        else if ((first == 'b' || second == 'b') && (Math.abs(row1 - row2) == Math.abs(col1 - col2))) {
            if (first == 'b') System.out.println(name1 + " threats " + name2);
            else System.out.println(name2 + " threats " + name1);

        }

        // If rook check that other tool is on same col or row to rook
        else if ((first == 'r' || second == 'r') && (row1 == row2 || col1 == col2)) {
            if (first == 'r') System.out.println(name1 + " threats " + name2);
            else System.out.println(name2 + " threats " + name1);
        }

        // If knight threats other tool
        else if ((first == 'k' || second == 'k') && ((Math.abs(row1 - row2) == 2 && Math.abs(col1 - col2) == 1) ||
                (Math.abs(row1 - row2) == 1 && Math.abs(col1 - col2) == 2))) {
            if (first == 'k') System.out.println(name1 + " threats " + name2);
            else System.out.println(name2 + " threats " + name1);

        } else System.out.println("no threat");
    }
}

