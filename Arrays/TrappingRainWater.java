package Arrays;
// O(n)
// O(n)
import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        sc.close();
        
        int trappedWater = trap(heights);
        System.out.println("Trapped water: " + trappedWater);
    }

    public static int trap(int[] heights) {
        int n = heights.length;
        int trappedWater = 0;

        int[] lmax=new int[n];
        int[] rmax=new int[n];

        lmax[0]=heights[0];
        for (int i = 1; i < n ; i++) {
            lmax[i]=Math.max(heights[i],lmax[i-1]);
        }

        rmax[n-1]=heights[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rmax[i]=Math.max(heights[i],rmax[i+1]);
        }

        for(int i=1;i<n-1;i++){
            trappedWater+=Math.min(lmax[i],rmax[i])-heights[i];
        }

        return trappedWater;
    }
}
