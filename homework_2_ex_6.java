package kukshinov.lesson_2;
//lesson 2 ex 6

public class homework_2_ex_6 {

    private static int equalArrial(int[] arr) {
        int summ_right = 0;
        int summ_left = 0;
        int equal = 0;

        for (int i = 0; i < arr.length; i++) {
            summ_left += arr[i];
            for (int a = i + 1; a < arr.length; a++) {
                summ_right += arr[a];
            }
            if (summ_left == summ_right) {
                equal = 1;
            }
            summ_right = 0;
        }
        return equal;
    }


        public static void main(String args[]) {
        int[] arr = {3, 5, 1, 4, 4, 1};
        boolean eqfound=false;

        if(equalArrial(arr)==1){eqfound=true;}
        System.out.print("Equality found " + eqfound);
}
}