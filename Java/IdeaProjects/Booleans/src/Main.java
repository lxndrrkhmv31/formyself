
public class Main {
    public static void main(String[] args) {
        int milkAmount = 1200; // ml
        int powderAmount = 500; // g
        int eggsCount = 10; // items
        int sugarAmount = 50; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        // Example
        // appleCount - 5
        if (appleCount >= 5 ) {
            System.out.println("Apple Juice");
        } else {
            System.out.println("Do not enough of the ingredients for the Apple Juice");
        }

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Do not enough of the ingredients for the Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        } else {
            System.out.println("Do not enough of the ingredients for the Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        } else {
            System.out.println("Do not enough of the ingredients for the Apple pie");
        }
    }
}