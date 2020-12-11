public class Persona
{
   private String nombre;
   private int edad;
   private String empleo;
   private double salario;
   
   public Persona()
   {
   }

   
   public Persona(String n)
   {
      nombre = n;
   }

   public String getNombre()
   {
      return nombre;
   
   }
   
   
   public void setNombre(String n)
   {
     // return nombre;
   
   }
   
   
   public int getEdad()
   {
      return edad;
   
   }
   
   
   public void setEdad(int e)
   {
      edad=e;
   
   }

}