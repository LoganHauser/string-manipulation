import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Hard coded string to read words from
        String testString = "the quick Brown Fox Jumped over the lazy dog";
        //Print the words from the hard coded string
        printWordsFromString(testString);

        //Create a Scanner object
        Scanner inputScanner = new Scanner(System.in);
        //Ask the user to input a string
        System.out.println("Enter a String:");
        //Print the words from the user-inputted string
        printWordsFromString(inputScanner.nextLine());
        //Close the Scanner
        inputScanner.close();
    }

    //Method to print each word in a string on a separate line and print a total word count
    public static void printWordsFromString(String string) {
        //Create an int variable to loop over each character in the string
        int i = 0;
        //Create a String variable to store the current word
        String word = "";
        //Create an int variable to store the number of words
        int wordCount = 0;
        while (true) {
            //If we are at the end of the string
            if (i >= string.length()) {
                //Print the last word
                System.out.println(word);
                //Increment the word count
                wordCount++;
                //Print the total number of words
                System.out.println("Number of words: " + wordCount);
                //Break from the loop
                break;
            }
            //If we are not at the end of the string, then continue

            //Get the character at the current index
            char character = string.charAt(i);
            //If the character is a space
            if (character == ' ' || character == '\t') {
                //Print the current word
                System.out.println(word);
                //Clear the word variable
                word = "";
                //Increment the word count
                wordCount++;
            //If the character is not a space and is not a punctuation symbol
            } else if (character != '.' && character != ',') {
                //Add the character to the current word
                word += character;
            }
            //Increment the current index
            i++;
        }
    }
}
