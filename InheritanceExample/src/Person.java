//Author: Brandyn "MonocleHat"
//Original Date: 2016-12-14
public class Person {
    protected String name;
    protected int age;

    public Person(String name){
        this.name = name;
        this.age = 0;
    }
    public Person (String n, int a){
        this.name = n;
        this.age = a;

    }
    public String getName(){
        return this.name;
    }
}
