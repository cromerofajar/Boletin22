package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author cromerofajar
 */
public class Boletin22 {

    public static void main(String[] args) {
        ArrayList<Correos> corre=new ArrayList<>();
        Buzon obx=new Buzon();
        String opcion;
        do{
           opcion=PedirDatos.texto("****MENU****\n\n Introduzca la palabra o conjunto de palabras que siguen al numero\n para poder moverse por las opciones del buzon.\n\n"
                   + " 1->Nuevo (crear un correo nuevo).\n 2->total correos (muestra los correos que contiene su buzon).\n"
                   + " 3->No leidos (muestra si tiene o no correos no leidos).\n"
                   + " 4->Mostrar correo no leido (le muestra el primer correo no leido).\n"
                   + " 5->Mostrar seleccionado (le muestra el correo que este en la posicion elegida).\n"
                   + " 6->Eliminar (borra el correo de la posicion elegida).\n"
                   + " 7->Salir (cierra el buzon).\n\n"
                   + "Introduzca la funcion que desea realizar:");
        switch(opcion.toLowerCase()){
            case "nuevo": obx.Correo(corre);
                          break;
            case "total correos": System.out.println(obx.numeroDeCorreos(corre));
                                  break;
            case "no leidos": boolean si=obx.porLeer(corre);
                              if(si==true){
                                  JOptionPane.showMessageDialog(null,"Tiene correos por leer");
                              }
                              else{
                                  JOptionPane.showMessageDialog(null,"No tiene correos por leer");
                              }
                              break;
            case "mostrar correo no leido": System.out.println(obx.mostrarNoLeidoPrimero(corre));
                                            break;
            case "mostrar seleccionado": int posicion=PedirDatos.entero("Introduzca que correo desea visualizar");
                                         obx.mostrar(corre, posicion);
                                         break;
            case "eliminar": posicion=PedirDatos.entero("Introduzca que correo desea eliminar");
                             obx.eliminar(corre, posicion);
                             break;
            case "salir": System.exit(0);
                          break;
            default: opcion=JOptionPane.showInputDialog(null, "Opcion no valida\n introduzca otra seguir para volver al menu:");
        }
        }while(!"salir".equalsIgnoreCase(opcion));
            
    }
    
}
