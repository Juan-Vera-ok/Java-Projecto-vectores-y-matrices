public class MatrizPares
{
   public static void main(String[]args)
   {
      int i=0,j=0;
      int [][]nros;
      final int TOPE=2;
      nros=new int[TOPE][TOPE];
      while(i<TOPE)
      {
         j=0;
         while(j<TOPE)
         {
         nros[i][j]=Console.readInt("Ingrese numero: ");
         j=j+1;
         }
      i=i+1;
      }
      
      i=0;
      System.out.println("Matriz Resultante: ");
       while(i<TOPE)
      {
         j=0;
         while(j<TOPE)
         {
         System.out.print(nros[i][j]);
         j=j+1;
         }
      System.out.println(" ");
      i=i+1;
      }
      j=0;
      i=0;
      while(i<TOPE)
      {
         j=0;
         while (j<TOPE)
         {
         if(nros[i][j]%2==0)
            System.out.println("El numero "+nros[i][j]+" es par");
         j=j+1;  
         }
      i=i+1;   
      }
      }
      }   //fin de class