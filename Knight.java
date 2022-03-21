package com.company;

import java.util.Scanner;

public class Knight {
    public static void main() {
        final int RIGHT_BORDER = 8, LEFT_BORDER = 1, UP_BORDER = 1, DOWN_BORDER = 8;
        Scanner scan = new Scanner(System.in);
        System.out.println("This program reads two integers which " + "represent the knight's location on the chess board: ");
        System.out.println("Please enter the number of row");
        final int row = scan.nextInt();
        System.out.println("Please enter the number of column");
        final int col = scan.nextInt();

        if ((row < UP_BORDER || row > DOWN_BORDER) || (col < LEFT_BORDER || col > RIGHT_BORDER)) { // illegal input
            System.out.println("input is illegal");
        } else { // searching for possible moves
            System.out.println("Moves:");

            //Move right
            {   // Move right and down
                int destinationCol = col + 2;
                int destinationRow = row + 1;
                if (destinationCol <= RIGHT_BORDER && destinationRow <= DOWN_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }

                //move right and up
                destinationRow = row - 1;
                if (destinationCol <= RIGHT_BORDER && destinationRow >= UP_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }
            }

            //Move left
            {   // Move left and down
                int destinationCol = col - 2;
                int destinationRow = row + 1;
                if (destinationCol >= LEFT_BORDER && destinationRow <= DOWN_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }

                //move left and up
                destinationRow = row - 1;
                if (destinationCol >= LEFT_BORDER && destinationRow >= UP_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }
            }

            //Move down
            {   // Move down and right
                int destinationRow = row + 2;
                int destinationCol = col + 1;
                if (destinationCol <= RIGHT_BORDER && destinationRow <= DOWN_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }

                //move down and left
                destinationCol = col - 1;
                if (destinationCol >= LEFT_BORDER && destinationRow <= DOWN_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }
            }

            //Move Up
            {   // Move up and right
                int destinationRow = row - 2;
                int destinationCol = col + 1;
                if (destinationCol <= RIGHT_BORDER && destinationRow >= UP_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }

                //move up and left
                destinationCol = col - 1;
                if (destinationCol >= LEFT_BORDER && destinationRow >= UP_BORDER) {
                    System.out.println(destinationRow + " " + destinationCol);
                }
            }
        }
    }
}

