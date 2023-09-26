import java.util.Scanner;
public class Vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String input = "";
        while(choice != 3)
        {
            System.out.println("---------MAIN MENU---------");
            System.out.println("1. Read input string");
            System.out.println("2. Compute number of values");
            System.out.println("3. Exit program");
            System.out.println();
            System.out.print("Enter option number: ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    System.out.print("Please enter a string: ");
                    input = sc.nextLine();
                    input = sc.nextLine();
                    System.out.println();
                    break;

                case 2:
                    if(input.isEmpty())
                    {
                        System.out.println("Please enter a string first");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("You entered string: " + input);
                        System.out.println("Number of vowels:   " + countVowels(input));
                        System.out.println();
                    }
                    break;
            }
        }
    }

     /*countVowels takes in a string, then sets the entire string to lower case so it doesn't matter
     in what case the inputted string was. Then, it creates an int numVowels that keep tracks of how many vowels are in
     the string. Then, there is a base case that returns zero when the string is empty. Next, there is an if statement
     that will increment numVowels if the first character of the string is a vowel. Finally, there is a statement that
     returns the value of numVowels(0 if it wasn't a vowel, and 1 if it was) added to a recursive call to countVowels that takes the
     substring of the string starting with index one */
    public static int countVowels(String word)
    {
        word = word.toLowerCase();
        int numVowels = 0;
        if(word.isEmpty())
        {
            return 0;
        }
        if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')
        {
            numVowels++;
        }
        return numVowels + countVowels(word.substring(1));
    }
}
