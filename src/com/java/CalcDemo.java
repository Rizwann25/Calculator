package com.java;
import java.util.Scanner;
abstract class Operations {
abstract void operation(int num1, int num2);

}
class Addition extends Operations {
void operation(int num1, int num2) {
System.out.println("Addition :" + (num1+num2));
}
}
class Substraction extends Operations {
void operation(int num1, int num2) {
System.out.println("Substraction :" + (num1-num2));
}
}
class Multiplication extends Operations {
void operation(int num1, int num2) {
System.out.println("Multiplication :" + (num1*num2));
}
}
class Division extends Operations {
void operation(int num1, int num2) {
System.out.println("Addition :" + (num1/num2));
}
}

  public class CalcDemo {
 
 
  public static void main(String[] args)
  {
  Operations obj;
  Scanner sc = new Scanner(System.in);
  System.out.println("\n Enter 1 to add \n Enter 2 Substract \n Enter 3 Multiple \n Enter 4 Division");
  int op = sc.nextInt();
  System.out.println("Enter First Number: ");
  int num1 = sc.nextInt();
  System.out.println("Enter Second Number: ");
  int num2 = sc.nextInt();
 
  if(op == 1) {
  obj = new Addition();
  obj.operation(num1, num2);
 
  }
  else if(op == 2) {
  obj = new Substraction();
  obj.operation(num1, num2);
 
  }
  else if(op == 3) {
  obj = new Multiplication();
  obj.operation(num1, num2);
 
  }
  else if(op == 4) {
  obj = new Division();
  obj.operation(num1, num2);
 
  }
  }
  }