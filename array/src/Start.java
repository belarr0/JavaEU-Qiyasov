public class Start {
    public static void main (String[] args){
/*
        int sum = 0, mult = 1;      //1

        int arr[] = {12, 6, 8, 52, 75, 5};


        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            mult = mult * arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.print("Mult = " + mult);
 */

/*
        int arr[] = {12, 6, 8, 52, 75, 5};      //2
        int max = 0;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("max: " + max);
 */

/*
        int arr[] = {12, 6, 8, 52, 75, 5};      //3
        int max = 0;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(max == arr[i]){
                System.out.print("max index: " + "[" + i + "]");
            }
        }
 */

        int arr[] = {12, 6, -8, -15, 75, 5};     //4
        int max = 0;
        int min = 0;
        int indmaxfrmin = 0;
        int indminfrmax = 0;
        int empty_ind = 0;

        for(int i = 0; i < arr.length; i++) {       //max && min
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){        //min from max && and max from min
            if(arr[i] > 0 && arr[i] <= max){
                indminfrmax = i;
            }
            if(arr[i] < 0 && arr[i] > min){
                indmaxfrmin = i;
            }
        }

        empty_ind = arr[indmaxfrmin];       //switch them
        arr[indmaxfrmin] = arr[indminfrmax];
        arr[indminfrmax] = empty_ind;

        for(int i = 0; i < arr.length; i++){        //output
            System.out.print(" " + arr[i]);
        }
    }
}
