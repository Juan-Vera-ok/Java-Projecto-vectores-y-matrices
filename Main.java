public class Main{
   public static void main(String[] args){
   
      Agenda ag1,ag2;
      Contacto c1,c2,c3;
      
      ag1=new Agenda("Agenda 1");
      c1=new Contacto("Perez");
      c1.setTelefono(234565);
      c2=new Contacto("Diaz");
      c2.setTelefono(565656);
      c3=new Contacto("Paz");
      c3.setTelefono(12341234);
      
      ag1.agregarContacto(c3);
      ag1.mostrarContactos();
      
      ag1.agregarContacto(c1);
      ag1.mostrarContactos();
   }


}