import java.util.*;
//It might improve the technique of searching since it can
//search a larger area and potentially be more efficient
//than searching through other means.
public class LinearSearch_Three {
    public static void main(String[] args) {
        int uNum = 0;
        Scanner uPrompt = new Scanner(System.in);
        System.out.println("Enter length of array");
        uNum = uPrompt.nextInt();
        int[]arr = new int[uNum];
        System.out.println("Enter your set of values");
        int a = 0;
        int c = 0;
        do{
            a = uPrompt.nextInt();
            c++;
            if (c<arr.length){
                arr[c] = a;
            }else{
                break;
            }
        }while(a!=0 || c<arr.length);
        System.out.print("array: ");
        for (int y = 0; y<arr.length;y++){
            System.out.print(+arr[y] +" ,");
        }
        System.out.println();
        linearSearch(arr,uNum);
    }
    public static void linearSearch(int[]arr, int num){
        int before = 0;
        int after = 0;
        //int X = num;
        boolean found = false;
        for (int i = 0; i<arr.length&&!found;i++){
            if (arr[i]==7){
                before = arr[i-1];
                after = arr[i];
                arr[i] = before;
                arr[i-1] = after;
            }
        }
        for (int y = 0; y<arr.length;y++){
            System.out.print(arr[y] +" ,");
        }
    }
}
