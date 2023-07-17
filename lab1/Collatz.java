/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if(n%2 == 1){
            /** the case for n is odd */
            return 3*n + 1;
        }else{
            /** the case for n is even */
            return n/2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        /** the sequence terminates at 1 */
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

