package kukshinov.lesson_2;

//lesson 2 ex 7
public class homework_2_ex_7 {

    private static void moveArrial(int[] arrn, int n) {

        int b = 0;
        int s = 0;

        if (n<0){}
        for (int i = 0; i < n; i++) {

            for (int a = 0; a < arrn.length - 1; a++) {
                s = arrn[a];
                b = arrn[a + 1];
                arrn[a + 1] = s;
                arrn[a] = b;
            }
            }
        for (int element : arrn) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        int[] arr = {3, 5, 1, 7, 8, 2};
        int n = 2;
        moveArrial(arr,n);
    }
}