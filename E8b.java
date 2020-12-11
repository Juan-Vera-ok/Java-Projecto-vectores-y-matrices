public class E8b
{
   public static void main(String[]args)
   {
      int Producto,suma,cont,num;
      Producto=1;
      suma=0;
      cont=1;
      while(cont<=3)
         {
            System.out.println("Ingrese numero");
            num=Console.readInt();
            suma=suma+num;
            Producto=Producto*num;
            cont=cont+1;
         }
            System.out.println("Suma de enteros"+" "+suma);
            System.out.println("Producto de enteros"+" "+Producto);
   }
}//Fin de class            