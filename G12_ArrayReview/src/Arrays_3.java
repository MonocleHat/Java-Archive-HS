public class Arrays_3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] data = {	{3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 4, -1, -8}};
        int sum = 0;
        //traverses array and adds all values into one integer for display.
        for (int i=0; i< data.length;i++){
            for (int j=0; j< data[i].length;j++){
                sum=sum+data[i][j];

            }
        }System.out.println("The sum of all the numbers is" +sum);


    }
}
