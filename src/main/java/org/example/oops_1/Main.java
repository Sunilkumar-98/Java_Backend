package org.example.oops_1;

public class Main {

    public static void main(String[] args){
         student one= new student();
         one.name= "Sunil";
         one.age= 23;
         one.psp=99;
         one.changeBatch();
         one.joinClass();
         one.printDetails();


        student two = new student();
        two.name = "Rohit";
        two.age=22;
        two.psp=100;
        two.printDetails();
    }
}
