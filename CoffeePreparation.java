public class CoffeePreparation {
    public static void main(String[] args) {
        System.out.println("Boiling water...");
        System.out.println("Adding coffee powder to the cup...");
        System.out.println("Pouring hot water into the cup...");
        System.out.println("Stirring the coffee...");
        
        boolean addSugar = true;  // Change to false if no sugar needed
        boolean addMilk = true;   // Change to false if no milk needed
        
        if (addSugar) {
            System.out.println("Adding sugar...");
        }
        if (addMilk) {
            System.out.println("Adding milk...");
        }
        
        System.out.println("Stirring again...");
        System.out.println("Coffee is ready to serve!");
    }
}