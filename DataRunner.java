import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    UserStory newState = new UserStory("stateTaxPercentages.txt", "state.txt", "ValueOfDollar.txt", "Rent.txt", "MeanWage.txt");
    Scanner input = new Scanner(System.in);
    System.out.println("Hello! Please type the state you are interested in: ");
    String choice = input.nextLine();
    System.out.println(newState.toString(choice));
    input.close();
  }
}