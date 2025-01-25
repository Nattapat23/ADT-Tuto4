import java.util.Scanner;

public class mainQueue {
    public static void main(String[] args) {
        queue q1 = new queue();
        Scanner input = new Scanner(System.in);
        String choice = "";

        System.out.println("Please enter student name (enter 'quite' for exit the program): ");
        do {        
            choice = input.nextLine();
            if (!choice.equalsIgnoreCase("quite")) {
                q1.enqueue(choice);
            }
        } while (!choice.equalsIgnoreCase("quite"));
        System.out.println();
        q1.print();
    }
}