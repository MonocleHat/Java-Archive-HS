public class LinearSearch_One {
    public static void main(String[] args) {
        int []arr = new int[] {1,3,5,7,8,6,9};
        linearSearch(arr);
    }
    public static void linearSearch(int []arr){
        int before = 0;
        int seven = 0;
        boolean found = false;

        for (int i = 0; i<arr.length&& !found; i++){
            if (arr[i] == 7){
                before = arr[i-1];
                seven = arr[i];
                arr[i] = before;
                arr[i-1] = seven;
            }

        }
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] +" , ");
        }
    }
}
