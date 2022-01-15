import java.util.Scanner;

class RepeatNumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the array number: ");
         int num = sc.nextInt();
         int [] array = new int[num];
         for (int i=0;i<num;i++){
             array[i] = sc.nextInt();
         }
         System.out.println();
         for (int i=0;i<num;i++){
         }
         for (int i =0;i< array.length;i++){
             for (int j =i+1;j< array.length;j++){
                if( array[i]==array[j]) {
                    System.out.println(array[j]);
                }
             }
         }

     }
}
