public class E6
{
   public static void main(String[]args)
   {
      int nro1,nro2,nro3;
      System.out.println("Ingrse 3 números enteros");
      nro1=Console.readInt();
      nro2=Console.readInt();
      nro3=Console.readInt();
      
      if(nro1>nro2&nro1>nro3)
         System.out.println("El numero mayor es el nro1,"+" "+nro1);
         else 
            if(nro2>nro1&nro2>nro3)
               System.out.println("El numero mayor es el nro2,"+" "+nro2);
               else
                  System.out.println("El numero mayor es el nro3,"+" "+nro3);
                  
   }
}//fin de class                 


