package com.techelevator.services;

import java.util.Scanner;

public class ConsoleService {

    OutputService outputService = new OutputService();

    private static final Scanner scanner = new Scanner(System.in);

    public static String tastingRedOrWhite(){     String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "white";
        } else if (option.equals("2")) {
            return "red";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForRedOrWhite();
            return tastingRedOrWhite();
        }
    }

    public static String promptForStringInput() {
        String answer;
        answer = scanner.nextLine().toLowerCase();
        return answer;
    }

    public static String promptForStringInputToUpperCase() {
        String answer;
        answer = scanner.nextLine().toUpperCase();
        return answer;
    }

    public static String getRedColorFromInput() {
        String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "garnet";
        } else if (option.equals("2")) {
            return "ruby";
        } else if (option.equals("3")) {
            return "purple";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForRedColor();
            return getRedColorFromInput();
        }
    }
    public static String getWhiteColorFromInput() {
        String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "straw";
        } else if (option.equals("2")) {
            return "yellow";
        } else if (option.equals("3")) {
            return "gold";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForWhiteColor();
            return getWhiteColorFromInput();
        }
    }


    public static String getClimateFromInput() {
        String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "cool";
        } else if (option.equals("2")) {
            return "moderate";
        } else if (option.equals("3")) {
            return "warm";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForClimate();
            return getClimateFromInput();
        }
    }

    public static Boolean getHasOakFromInput() {
        String option = scanner.nextLine();
        if (option.equals("1")) {
            return true;
        } else if (option.equals("2")) {
            return false;
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForHasOak();
            return getHasOakFromInput();
        }
    }

    public static String getBodyFromInput(){
        String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "light";
        } else if (option.equals("2")) {
            return "medium";
        } else if (option.equals("3")) {
            return "full";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForBody();
            return getBodyFromInput();
        }
    }

    public static String getSweetnessFromInput(){
        String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "dry";
        } else if (option.equals("2")) {
            return "off-dry";
        } else if (option.equals("3")) {
            return "sweet";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.promptForSweetness();
            return getSweetnessFromInput();
        }
    }

    public static String getStructureFromInput() {
        String option = scanner.nextLine();
        //String option = selectedOption.trim().toUpperCase();
        if (option.equals("1")) {
            return "low";
        } else if (option.equals("2")) {
            return "moderate minus";
        } else if (option.equals("3")) {
            return "moderate";
        } else if (option.equals("4")) {
            return "moderate plus";
        } else if (option.equals("5")) {
            return "high";
        } else {
            OutputService.displayMessage("\n\n" + option + " is not valid. Please make another selection.");
            OutputService.structureScale();
            return getStructureFromInput();
        }
    }

}
