package day10_Practice;

public class TaxCalculation {
    public static void main(String[] args) {
        /*
        Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
         */

        int salary= 150000;
        boolean MarriedOrNot= false;

        if(salary>=130000 && MarriedOrNot==true){
            System.out.println("salary= "+(salary-salary*.3));
        }else if(salary>=130000 && MarriedOrNot==false){
            System.out.println("salary= "+(salary-salary*.35));
        }else if(salary>=100000 && MarriedOrNot==true){
            System.out.println("salary= "+(salary-salary*.25));
        }else if(salary>=100000 && MarriedOrNot==false){
            System.out.println("salary= "+(salary-salary*.30));
        }else if(salary>=80000 && MarriedOrNot==true){
            System.out.println("salary= "+(salary-salary*.20));
        }else if(salary>=80000 && MarriedOrNot==false){
            System.out.println("salary= "+(salary-salary*.25));
        }else if (salary<=79000 && MarriedOrNot==true){
            System.out.println("salary= " + (salary -salary * .15));
        }
        else{
            System.out.println("salary= "+(salary -salary * .20));
        }

    }
}
