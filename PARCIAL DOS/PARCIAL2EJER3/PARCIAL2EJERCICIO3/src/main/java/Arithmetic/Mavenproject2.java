  
 package Arithmetic;

public class Mavenproject2 {

  
class Arithmetic {
     public int add(int x , int y ) {
         
         int suma = x+y;
         return suma;
    }    
}

class Adder extends Arithmetic {

    public Adder() {
    }
    
}


public class Solution {
    public  static  void main(String []args){
    // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
       System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
       
       // Print the result of 3 calls to Adder&#39;s `add(int,int)` method as 3 space-separated integers :
       System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + " ");
    }
}}