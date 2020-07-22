/*
This class is part of the GradeChecker project, originally created in 2017
Devoid of comments, this project was cobbled back together and finished in 2020, by MonocleHat, the original author


The first class, Grade is used to store information on the class object "Grade"
    Grade contains a double value used to refer to the percentage for a student
    Features a method to set the percentage of the grade value
    Features a method to get the letter value of the student's percent mark
    Features a method to get the grade itself
    And features a method to return the grade value in a string format
 */

public class Grade {
    private double percent;

    public Grade(double g){
        this.percent = g;
    }
    public String getLetter(){
        String letterGrade = " ";
        if (this.percent == 100 || this.percent < 99 && this.percent > 80 || this.percent == 80){
            letterGrade = "A";
        }
        if (this.percent == 79 || this.percent < 79 && this.percent > 70 || this.percent == 70){
            letterGrade = "B";
        }
        if (this.percent == 69 || this.percent < 69 && this.percent > 60 || this.percent == 60){
            letterGrade = "C";
        }
        if (this.percent == 59 || this.percent < 59 && this.percent > 50 || this.percent == 50){
            letterGrade = "D";
        }
        if (this.percent == 49 || this.percent < 49 && this.percent > 0 || this.percent == 0){
            letterGrade = "F";
        }
        if (this.percent < 0){
            letterGrade = "DNC";
        }
        return letterGrade;
    }
    public double getGrade(){
        return this.percent;
    }

    public String toString(){
        return ""+String.format("%.2f", percent);
    }

}
