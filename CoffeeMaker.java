public class CoffeeMaker {
    public static void main(String[] args) {
        System.out.println("Boiling water...");
        System.out.println("Adding coffee powder to the cup...");
        System.out.println("Pouring hot water into the cup...");
        System.out.println("Stirring the coffee...");
        
        boolean addSugarMilk = true; // Change to false if not needed
        if (addSugarMilk) {
            System.out.println("Adding sugar and milk...");
            System.out.println("Stirring again...");
        }
        
        System.out.println("Coffee is ready. Enjoy!");
    }
}