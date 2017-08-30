import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args) {
        int numArray[] = new int[12];
        int x;
        for (x = 0; x < numArray.length; ++x) {
            System.out.println("Enter number " + (x + 1) + ":");
            Scanner scanner = new Scanner(System.in);
            numArray[x] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numArray));
        for (int y = 0; y < numArray.length / 2; ++y){
            int temp = numArray[y];
            numArray[y] = numArray[numArray.length - y - 1];
            numArray[numArray.length - y - 1] = temp;
        }

        System.out.println(Arrays.toString(numArray));


    }
}
