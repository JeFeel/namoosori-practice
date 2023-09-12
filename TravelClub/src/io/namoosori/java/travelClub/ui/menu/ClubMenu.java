package io.namoosori.java.travelClub.ui.menu;


import java.util.Scanner;


public class ClubMenu {

    private Scanner sc;

    public ClubMenu() {
        this.sc = new Scanner(System.in);
    }

    public void show() {
        int inputNumber = 0;
        while (true) {
            displayMenu();
            inputNumber = selectMenu();
            System.out.println(inputNumber);
            switch (inputNumber) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Choose again!");
            }
        }
    }

    private void displayMenu() {
        System.out.println("------------------");
        System.out.println("clubmenu");
        System.out.println("------------------");
        System.out.println("1. Register");
        System.out.println("2. FindAll");
        System.out.println("3. FindID");
        System.out.println("4. FindName");
        System.out.println("5. Modify");
        System.out.println("6. Remove");
        System.out.println("------------------");
        System.out.println("0. Previous");
        System.out.println("------------------");

    }

    private int selectMenu() {
        System.out.print("Select : ");
        int menuNumber = sc.nextInt();
        if (menuNumber >= 0 && menuNumber <= 6) {
            sc.nextLine();
            return menuNumber;
        } else {
            System.out.println("Invalid Number ➡️ " + menuNumber);
            return -1;
        }
    }
}
