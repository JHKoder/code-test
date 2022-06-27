package ag;

import java.util.Arrays;

public class SquareTurn {
    public static void main(String[] args){
        int[][] nums = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] numbers = new int[nums.length][nums.length];

        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                numbers[j][nums.length-1-i] = nums[i][j];
            }
        }

        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(numbers[i][j]+",");
            }
            System.out.println();
        }

//        for(int i=0;i< nums.length;i++){
//            for(int j=nums[i].length;j>=0;j--){
//                System.out.print(i + " , " + j +" | ");
//            }
//            System.out.println();
//        }



    }
}
