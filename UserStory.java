/**
 * The UserStory class processes economic data for U.S. states, including tax percentages, 
 * dollar value, average rent, and mean wages. It retrieves data from the provided txt files.
 */
public class UserStory {

    // Arrays to store various economic data
    double[] taxData;      // Tax percentages for each state
    String[] stateData;    // State names
    double[] dollarData;   // Value of a dollar in each state
    int[] rentData;        // Average rent costs
    int[] wageData;        // Mean wages

    /**
     * Constructor that initializes the UserStory object by reading data from files.
     */
    public UserStory(String taxFile, String stateFile, String dollarFile, String rentFile, String wageFile) {
        taxData = FileReader.toDoubleArray(taxFile);
        stateData = FileReader.toStringArray(stateFile);
        dollarData = FileReader.toDoubleArray(dollarFile);
        rentData = FileReader.toIntArray(rentFile);
        wageData = FileReader.toIntArray(wageFile);
    }

    /**
     * Retrieves and formats relevant financial data for a specified state.
     */
    public String toString(String target) {
        for (int i = 0; i < stateData.length; i++) {
            if (stateData[i].equals(target)) {
                return "Here is some financial data for the state of " + target + ": \n" +
                       "Has a tax rate of " + taxData[i] + "%.\n" +
                       "$100 is actually worth $" + dollarData[i] + ".\n" +
                       "The cost of monthly rent is at an average of $" + rentData[i] + ".\n" +
                       "The mean wage is $" + wageData[i] + ".";
            }
        }
        return "State not found";
    }
}
