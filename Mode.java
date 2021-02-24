//CS2
//This program generates arrays and finds the mode of the array
import java.util.Scanner;
import java.util.Random;
public class Mode {
    public static void main(String[] args) {
        //initializers
        Scanner keyb=new Scanner(System.in);
        int mode=0;
        //user input
        System.out.println("Enter the desired number of rows");
        int rows=keyb.nextInt();
        System.out.println("Enter the desired number of columns");
        int cols=keyb.nextInt();
        int[][] randoms=new int[rows][cols];
        int[] count=new int[11];
        //fills array with random numbs
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                randoms[row][col]=new Random().nextInt(11);
            }
        }
        //counts the instances of each integer
        for(int row=0;row<rows;row++) {
            for (int col = 0; col < cols; col++) {
                    count[randoms[row][col]]+=1;
            }
        }
        //prints the arrays
        for(int row=0;row<rows;row++) {
            System.out.println();
            for (int col = 0; col < cols; col++) {
                System.out.print(randoms[row][col]+" ");
            }
        }
        //produces the mode
        for(int i=0;i<11;i++){
            if(count[i]>mode){
                mode=i;
            }
        }
        System.out.println("The mode is; "+mode);
    }
}

