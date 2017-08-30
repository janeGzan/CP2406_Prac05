import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args)
    {
         char aChar;
         Scanner scanner = new Scanner(System.in);
         aChar = scanner.next().charAt(0);
         System.out.println("The character is "+ aChar);
         if (Character.isUpperCase(aChar))
             System.out.println(aChar + " is uppercase");
         else
             System.out.println(aChar + " is not uppercase");
         if (Character.isLowerCase(aChar))
             System.out.println(aChar + " is lowercase");
         else
             System.out.println(aChar + " is not lowercase");
         aChar = Character.toLowerCase(aChar);
         System.out.println("After toLowerCase(). aChar is " + aChar);
         aChar = Character.toUpperCase(aChar);
         System.out.println("After to UpperCase(), aChar is " + aChar);
         if (Character.isLetterOrDigit(aChar))
             System.out.println(aChar + " is a letter or a digit");
         else
             System.out.println(aChar + " is neither a letter or a digit");
         if (Character.isWhitespace(aChar))
             System.out.println(aChar + " is whitespace");
         else
             System.out.println(aChar + " is not whitespace");
    }
}
