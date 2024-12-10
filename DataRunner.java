import java.util.Scanner;

/**
 * Program displays financial data for each US state
 */
public class DataRunner {
    public static void main(String[] args) {

        // Create a UserStory object initialized with the use of different txt files from my dataset
        UserStory newState = new UserStory(
                "stateTaxPercentages.txt", 
                "state.txt", 
                "ValueOfDollar.txt", 
                "Rent.txt", 
                "MeanWage.txt"
        );

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a state name
        System.out.println("Hello! Please type the state you are interested in: ");
        String choice = input.nextLine();

        // Display the state-specific economic data
        System.out.println(newState.toString(choice));

        // Close the Scanner
        input.close();
    }
}
