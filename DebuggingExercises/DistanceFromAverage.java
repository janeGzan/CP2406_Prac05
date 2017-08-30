import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {
        double total = 0;
        List<Double> numList = new ArrayList<>();
        String input = JOptionPane.showInputDialog(null, "Enter any number between 0 and 20: ");
        double inputDouble = Double.parseDouble(input);
        while (inputDouble != 99999)
            if (inputDouble < 0 || inputDouble > 20) {
                input = JOptionPane.showInputDialog(null, "Enter any number between 0 and 20: ");
                inputDouble = Double.parseDouble(input);
            } else {
                numList.add(inputDouble);
                input = JOptionPane.showInputDialog(null, "Enter any number between 0 and 20: ");
                inputDouble = Double.parseDouble(input);
            }
        if (numList.size() == 0) {
            System.out.println("Error");
        } else {
            for (int x = 0; x < numList.size(); ++x) {
                total += numList.get(x);
            }
            double avg = total / (numList.size() - 1);
            for (int y = 0; y < numList.size(); ++y) {
                if (numList.get(y) > avg) {
                    System.out.println(String.format("%s is %.2f away from %.2f", numList.get(y), numList.get(y) - avg, avg));
                } else {
                    System.out.println(String.format("%s is %.2f away from %.2f", numList.get(y), avg - numList.get(y), avg));
                }
            }
        }
    }
}
