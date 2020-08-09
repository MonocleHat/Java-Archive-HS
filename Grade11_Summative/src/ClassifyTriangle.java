import java.util.*;
public class ClassifyTriangle {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a,b,c; //Stores value of the 3 sides of the triangle
        double[]triArray; //Stores value of the three sides in an array IF its a triangle.
        triArray = new double[3];
        int checkTri = 0; //Exits the while loop in the main method when value is 1
        int triType =0; //Determines the type of triangle (from its side lengths)
        Scanner userPrompt = new Scanner (System.in);

        do{//Repeatedly prompt the user for 3 values until a triangle is formed.
            System.out.println("Enter the value of 'a'");
            a = userPrompt.nextDouble();
            System.out.println("Enter the value of 'b'");
            b = userPrompt.nextDouble();
            System.out.println("Enter the value of 'c'");
            c = userPrompt.nextDouble();
            if (a==b&&b==c){ //Equilateral triangle
                triArray[0] = a;
                triArray[1]= b;
                triArray [2] = c;
                checkTri = 1;
                triType =1;//Exit loop
            }	else if(a >= (b+c) || c >= (b+a) || b >= (a+c) ){ //Not a triangle
                System.out.println("Not a triangle");
                checkTri = 0;
                triType = 0;
            }

            else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a)){ //Isoceles triangle
                triArray[0] = a;
                triArray[1]= b;
                triArray [2] = c;
                checkTri =1;
                triType =2;
            }
            else if(a!=b && b!=c && c!=a){//Scalene Triangle
                triArray[0] = a;
                triArray[1]= b;
                triArray [2] = c;
                checkTri=1;
                triType = 3;
            }
        }while(checkTri!=1);//Exit do/while loop
        //Bubble sort into ascending order, TEMP variable used in sorting numbers to array
        double temp;
        for (int i = 0; i < (triArray.length - 1); i++){
            for (int j = 0; j < (triArray.length - 1); j++){


                if (triArray[j] >triArray[j+1]){
                    temp = triArray[j];
                    triArray[j] = triArray[j+1];
                    triArray[j+1] = temp;

                }
            }
        }
        for (int x =0; x<triArray.length; x++){
            System.out.println(triArray[x]);
        }
        triangleType(triType,checkTri,triArray);//Call method triangleType.
        userPrompt.close();
    }



    public static void triangleType(int triType, int checkTri, double[] triArray){ //Method that calculates Angle C, based on triangle type, used to determine if obtuse, acute, rightangled.
        double angleC = 0;
        //displays triangle type based on triType variable.determines angle C.
        if (triType == 1){
            System.out.println("This triangle is an Equilateral Triangle");

            angleC =  (Math.pow(triArray[0],2) + Math.pow(triArray[1], 2) - Math.pow(triArray[2], 2)) / (2*((triArray[0])*(triArray[1])));
            angleC = Math.acos(angleC) * (180/Math.PI);
            triangleClassified (angleC);
        }else if (triType == 2){
            System.out.println("This triangle is an Isoceles Triangle");
            angleC =  (Math.pow(triArray[0],2) + Math.pow(triArray[1], 2) - Math.pow(triArray[2], 2)) / (2*((triArray[0])*(triArray[1])));
            angleC = Math.acos(angleC) * (180/Math.PI);
            triangleClassified (angleC);
        }else if (triType == 3){
            System.out.println("This triangle is a Scalene Triangle");
            angleC =  (Math.pow(triArray[0],2) + Math.pow(triArray[1], 2) - Math.pow(triArray[2], 2)) / (2*((triArray[0])*(triArray[1])));
            angleC = Math.acos(angleC) * (180/Math.PI);
            triangleClassified (angleC);
        }else if (triType == 0){
            System.out.println("Error Code: Ocarina ");
            System.out.println("'You've met with a terrible fate havent you?'");
            System.out.println("(If you're reading this, then clearly, something has gone horribly wrong.) ");

        }
    }
    public static void triangleClassified (double angleC){//Determine angle of triangle based on value of angle C
        if (angleC > 90){
            System.out.println("This angle is obtuse");
        }else if (angleC == 90){
            System.out.println("This angle is right-angled");
        }else if (angleC < 90){
            System.out.println("This angle is Acute");
        }
    }
}
