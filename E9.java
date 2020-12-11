public class E9
{
   public static void main(String[]args)
   {
      int nota,sobre,satis,nosatis;
      sobre=0;
      satis=0;
      nosatis=0;
      do
         {
         do
         {
            System.out.println("Ingrese numero");
            nota=Console.readInt();
            if(nota<-1|nota>100)
            System.out.println("Numero invalido");
         }while(nota<-1|nota>100);
            if(nota>=0&nota<=59)
            {
               nosatis=nosatis+1;
               System.out.println("El examen con nota "+nota+" no es satisfactoria");
            }else
                  if(nota>59&nota<=89)
                  {
                  satis=satis+1;
                  System.out.println("El examen con nota "+nota+" es satisfactoria");
                  }else
                        if(nota>89&nota<=100)
                        {
                        sobre=sobre+1;
                        System.out.println("El examen con nota "+nota+" es sobresaliente");
                        }
         }while(nota!=-1);
         System.out.println("Hay "+nosatis+" notas no satisfactorias");
         System.out.println("Hay "+satis+" notas satisfactorias");
         System.out.println("Hay "+sobre+" notas sobresalientes");
  }
}//fin de class    