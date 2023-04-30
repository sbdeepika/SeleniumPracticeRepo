package week1.day1;

public class IsPrime {
    public static void main(String args[]) {
      int n =22, flag =0;
     
         for(int i=2;i<n;i++){
          if(n%i==0){
              System.out.println(n + "is not a prime number");
              flag = 1;
              Break;
          }
      }
      
      if (flag ==0){
          System.out.println(n + "is a prime number");
      }
    }
}
