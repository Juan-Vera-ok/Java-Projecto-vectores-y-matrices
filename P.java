public class P
{
   public static void main(String[]args)
   {
      int n;
   System.out.println("Ingrese valor n");
   n=Console.readInt();
   
   fibonacci(n);
   
   }
   static int fibonacci(int n)
   {
    if(n==1||n==2)
    return n=1;
      else 
      return fibonacci(n-1,n-2);
   }   
}