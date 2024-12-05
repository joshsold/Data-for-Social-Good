public class UserStory {
    double[] taxData;
    String[] stateData;
    double[] dollarData;
    int[] rentData;
    int[] wageData;

    public UserStory(String taxFile, String stateFile, String dollarFile, String rentFile, String wageFile) {
        taxData = FileReader.toDoubleArray(taxFile);
        stateData = FileReader.toStringArray(stateFile);
        dollarData = FileReader.toDoubleArray(dollarFile);
        rentData = FileReader.toIntArray(rentFile);
        wageData = FileReader.toIntArray(wageFile);
    }

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