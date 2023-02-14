package com.techelevator.services;




public class OutputService {

    public static void promptForRedOrWhite(){
        System.out.println("What color Wine Are you tasting?");
        System.out.println("1) White");
        System.out.println("2) Red");
    }

    public static void promptForRedColor(){
        System.out.println("How would you describe the wine's color");
        System.out.println("Enter the corresponding number selection:");
        System.out.println("1) Garnet(Red with Brown/Orange hues)");
        System.out.println("2) Ruby(Deep red)");
        System.out.println("3) Purple");
    }

    public static void promptForWhiteColor(){
        System.out.println("How would you describe the wine's color");
        System.out.println("Enter the corresponding number selection:");
        System.out.println("1) Straw");
        System.out.println("2) Yellow");
        System.out.println("3) Gold");
    }

    public static void structureScale(){
        System.out.println("Enter the corresponding number selection:");
        System.out.println("1) Low to Moderate Minus");
        System.out.println("2) Moderate Minus");
        System.out.println("3) Moderate");
        System.out.println("4) Moderate Plus");
        System.out.println("5) High");
    }

    public static void promptForBody(){
        System.out.println("How would you describe the body of the wine?");
        System.out.println("Enter the corresponding number selection:");
        System.out.println("1) Light");
        System.out.println("2) Medium");
        System.out.println("3) Full");
    }

    public static void promptForTannin(){
        System.out.println("How would you describe the wine's tannins");
        structureScale();
    }

    public static void promptForAlcohol(){
        System.out.println("How would you describe the wine's alcohol level");
        structureScale();
    }

    public static void promptForAcidity(){
        System.out.println("How would you describe the wine's acidity");
        structureScale();
    }

    public static void promptForSweetness(){
        System.out.println("How would you describe the sweetness of the wine?");
        System.out.println("Enter the corresponding number selection:");
        System.out.println("1) Dry");
        System.out.println("2) Off-Dry");
        System.out.println("3) Sweet");
    }

    public static void promptForHasOak(){
        System.out.println("Does the wine give the impression of oak aging?");
        System.out.println("1) true");
        System.out.println("2) false");
    }

    public static void promptForFruitTypeRed(){
        System.out.println("Describe the wine's predominant fruit flavor(s) from the list below:");
        System.out.println("You may enter up to two(type words separated by a comma)");
        System.out.println("EXAMPLE: red, black");
        System.out.println("red -> Raspberry, Cranberry, Strawberry, Red Currant");
        System.out.println("black -> Black Cherry, Blackberry, Plum, Black Currant");
        System.out.println("blue -> Blueberry, Elderberry");
    }
    public static void promptForFruitTypeWhite(){
        System.out.println("Describe the wine's predominant fruit flavor(s) from the list below:");
        System.out.println("You may enter up to two(type words separated by a comma)");
        System.out.println("EXAMPLE: citrus, orchard");
        System.out.println("citrus -> Lemon, Lime, Orange");
        System.out.println("orchard -> Apple, Pear, Quince");
        System.out.println("stone fruit -> Peach, Apricot, Cherry, Melon");
        System.out.println("tropical -> Pineapple, Guava, Passion Fruit");
    }


    public static void promptForFruitCondition(){
        System.out.println("Describe the fruit condition from the list below:");
        System.out.println("You may enter up to two(type words separated by a comma)");
        System.out.println("tart, ripe, overripe, jammy, stewed, or dried");

    }

    public static void promptForRedNonFruitNotes(){
        System.out.println("List any non fruit characteristics present in the wine from the list below:");
        System.out.println("You may enter up to five(type words separated by a comma)");
        System.out.println("EXAMPLE: Mocha, Leather, Toast");
        System.out.println("Floral, Vegetal, Green Pepper, Dried Herbs, Tomato Leaf, Mint, Eucalyptus");
        System.out.println("Peppercorn, Cocoa, Mocha, Game, Cured Meat, Leather, Balsamic, Tar");
        System.out.println("Forest Floor, Wet Leaves, Mushrooms, Stone, Rock, Mineral, Sulphur");
        System.out.println("Vanilla, Smoke, Toast, Coconut");
    }
    public static void promptForWhiteNonFruitNotes(){
        System.out.println("List any non fruit characteristics present in the wine from the list below:");
        System.out.println("You may enter up to five(type words separated by a comma)");
        System.out.println("EXAMPLE: Floral, Stone, Nutty");
        System.out.println("Floral, Herbal, Vegetal, Nutty");
        System.out.println("Gingered, Honey, Wax, Butter, Creamy");
        System.out.println("Stone, Rock, Mineral, Sulphur");
        System.out.println("Vanilla, Spice, Smoke, Yeast, Baked Bread");
    }


    public static void promptForClimate(){
        System.out.println("How would you describe the predominant fruit character of the wine?");
        System.out.println("1) Cool");
        System.out.println("2) Warm");
        System.out.println("3) Moderate");
    }

    public static void promptForWorld(){
        System.out.println("Does the wine present as Old World(Europe) or New World(USA, South America, Australia)?");
        System.out.println("Enter OW for old world or NW for new world");
    }

    public static void displayMessage(String message)
    {
        System.out.println(message);
    }
}
