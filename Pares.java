public class Pares
{
   public static void main(String[]args)
   {
      int indice=0;
      int []nros;
      final int TOPE=10;
      nros=new int[TOPE];
      while(indice<TOPE)
      {
         nros[indice]=Console.readInt("Ingrese numero: ");
         indice=indice+1;
      }
      
      indice=0;
      System.out.println("Vector Resultante: ");
      while(indice<TOPE)
      {
         System.out.print(nros[indice]+" ");
         indice++;
      }
         System.out.println(" ");
         System.out.println("Numeros Pares ");
         indice=0;
      while(indice<TOPE)
      {
         if(nros[indice]%2==0)
            System.out.println("El numero "+nros[indice]+" es par");
         indice=indice+1;  
      }
      }
      }   //fin de class