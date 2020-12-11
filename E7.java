public class E7
{ 
   public static void main(String[]args)
   {
      char dia;
      System.out.println("Ingrese dia");
      dia=Console.readChar();
      switch(dia){
         case 'l':{
                System.out.println("Hoy no tengo resolucion");
                break;
                }
         case 'm':{
                System.out.println("Hoy tengo resolucion");
                break;
                }
         case 'i':{
                System.out.println("Hoy tengo resolucion");
                break;
                }
         case 'j':{
                System.out.println("Hoy tengo resolucion");
                break;
                }
         case 'v':{
                System.out.println("Hoy no tengo resolucion");
                break;
                }
         default:{
                System.out.println("No corresponde a ningun dia");
                break;
                }
            }
    }
}//fin de class