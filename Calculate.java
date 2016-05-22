import java.lang.Math;
public class Calculate{
  
   public static void main(String[] args){

     System.out.println("Calculate...");
   int first = Integer.valueOf(args[0]);
   int second = Integer.valueOf(args[1]);
   int summ = first + second;
   int minus = first - second;
   int multipl = first * second;
   int divis = first / second;  
   int sqr = (int) Math.pow(first, second);

   
   System.out.println("Summ "+summ);
   System.out.println("Minus "+minus);
   System.out.println("Multiplication "+multipl);
   System.out.println("Division "+divis);
   System.out.println("Sqr "+sqr);
    
  }
}