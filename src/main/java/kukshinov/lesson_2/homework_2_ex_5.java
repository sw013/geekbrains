package kukshinov.lesson_2;
//lesson 2 ex 5
public class homework_2_ex_5 {

    public static void main(String args[]) {
        int[] arr = {3,5,1,7,8,2};
        int a = 0;
        int b = 0;

        for(int i = 0; i <= arr.length-1; i++){
            for (int element : arr) {
                if(arr[i] > element){
                    a++;
                }
                if(arr[i] < element){
                    b++;
                }
            }
            if (a==0){
                System.out.println("The smallest - " + arr[i]);
            }
            if(b==0){
                System.out.println("The biggest - " + arr[i]);
            }
            a=0;
            b=0;
        }
    }
}


