//Alan Stoloff
//Dr helsing
//cs2
//This program puts a given list in order
public class Sorted {
    public static void main(String[] args) {
        //initializes variables
        char[] chars={'b','f','a','z','m','g'};
        //runs method
        int iterations=sort(chars);
        //produces output
        System.out.println("The number of iterations is: " +iterations);
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }
    }
    public static int sort(char[] a){
        //variables
        int count=0;
        boolean sorted=false;
        //While loop to sort the given list
        while(count<9){
            for(int i=0;i<a.length-1;i++){
                count++;
                char t=a[i];
                char c=a[i+1];
                int temp1=(int) t;
                int temp2=(int) c;  //if the elements are out of order swap them.
                if(temp1>temp2){
                    char temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
                for(int j=0;j<a.length;j++){   //prints the array
                    System.out.print(a[j]+" ");
                }

            }
        }//returns the count
        return count;
    }
}
