import java.util.Arrays;
import java.util.Scanner;
public class BabyNameComparison {

    public static void main (String[] args)
    {
        String nameArray[] = new String[3];
        for(int x = 0; x <= 2; ++x) {
            System.out.println("Enter name " + (x + 1) + ": " );
            Scanner scanner = new Scanner(System.in);
            nameArray[x] = scanner.nextLine();
        }
        for(int y = 0; y <= nameArray.length-1; ++y){
            System.out.println(nameArray[y]+nameArray[0]);
            System.out.println(nameArray[y]+nameArray[1]);
            System.out.println(nameArray[y]+nameArray[2]);
        }


    }
}
