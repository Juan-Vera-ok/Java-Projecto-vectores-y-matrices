public class Contacto
{
   private String apellido;
   private int telefono;
   
   public Contacto(String ap)
   {
      apellido = ap;
   
   }
   public void setApellido(String ap){
      apellido = ap;
      return;
   }
   
   public String getApellido(){
      return apellido;
   }
   
    public void setTelefono(int t){
      telefono = t;
      return;
   }
   
   public int getTelefono(){
      return telefono;
   }
   
   
}