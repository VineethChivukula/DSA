package Recursions;
// O(2^n)
// O(n)
import java.util.ArrayList;
import java.util.Scanner;

public class SubsetsOfAStringRecur {
    public static void generateSubsets(String str, int index, String current, ArrayList<String> subsets) {
        if (index == str.length()) {
            subsets.add(current);
            return;
        }

        // Include the current character
        generateSubsets(str, index + 1, current + str.charAt(index), subsets);

        // Exclude the current character
        generateSubsets(str, index + 1, current, subsets);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayList<String> subsets = new ArrayList<>();
        generateSubsets(input, 0, "", subsets);

        for (String subset : subsets) {
            System.out.println(subset);
        }

        sc.close();
    }
}