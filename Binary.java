import java.util.ArrayList;

class Binary {
     static void block(long x) {
         ArrayList<Integer> v = new ArrayList<Integer>();
         System.out.print("Blocks for " + x + " : ");
         while (x > 0) {
             v.add((int) x % 2);
             x = x / 2;
         }
         for (int i = 0; i < v.size(); i++) {
             if (v.get(i) == 1) {
                 System.out.print(i);
                 if (i != v.size() - 1)
                     System.out.print(", ");
             }
         }
         System.out.println();
     }

     public static void main(String args[]) {
         block(1213);
         block(29);
     }
 }
