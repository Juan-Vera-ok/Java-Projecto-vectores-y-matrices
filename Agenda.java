public class Agenda{
   
   private String nombre;
   private Contacto[]datos;
   private int pos;
   
   public Agenda(String n){
   
      nombre=n;
      datos=new Contacto[10];
      pos=0;
   }
   
   public void agregarContacto(Contacto c){
   datos[pos]=c;
   pos=pos+1;
   
   }
   public void mostrarContactos(){
      Contacto caux;
      for (int i=0;i<pos;i=i+1){
         caux=datos[i];
         System.out.println("Nombre: "+caux.getApellido());
         System.out.println("Telefono: "+caux.getTelefono());
         
      }
   }
}