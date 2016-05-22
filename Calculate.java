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

   
   System.out.println("Сумма "+summ);
   System.out.println("Разница "+minus);
   System.out.println("Умножение "+multipl);
   System.out.println("Деление "+divis);
   System.out.println("Возведение в степень "+sqr);
    
  }
}