public class mostrarvector
{
   public static void main(String[] args)
   {
      int i;
      int []Vector;
      Vector=new int[3];
       
   for(i=0;i<=3-1;i=i+1)
   {
      System.out.println("Ingrese valor");
      Vector[i]=Console.readInt();
   }         
   
   mostrarVector(Vector,3,0);
   
   
   }
   static int mostrarVector(int[]Vector,int DIM,int I)
   {
      if(I==DIM-1)
      {
      System.out.println(Vector[I]);
         return Vector[I];
      }   
      else
      {
      System.out.println(Vector[I]);
         return mostrarVector(Vector,DIM,I+1);
      
      } 
   }     
}