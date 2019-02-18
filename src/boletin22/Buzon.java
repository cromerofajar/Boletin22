package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author cromerofajar
 */
public class Buzon {
    public void Correo(ArrayList<Correos> cor){
        String correo=PedirDatos.texto("Introduzca el mensaje del correo a añadir");
        boolean leido=false;
        Correos corre=new Correos(correo,leido);
        cor.add(corre);
    }
    public int numeroDeCorreos(ArrayList<Correos> cor){
        int numero=cor.size();
        return numero;
    }
    public boolean porLeer(ArrayList<Correos> cor){
        for(Correos corre:cor){
            if(corre.getLeido()==false){
                return true;
            }
        }
        return false;
    }
//    public String mostrarNoLeidoPrimero(ArrayList<Correos> cor){
//        String mensaje;
//        for(Correos corre:cor){
//            if(corre.getLeido()==false){
//                //if(!corre.getLeido()){ seria la otra opcion y automaticamente se ejecuta si es true
//                mensaje=corre.getMensaje();
//                corre.setLeido(true);
//                return mensaje;
//            }
//        }
//        return "Ninguno por leer";
//    }
//          SIN LLAMAR A porLeer.
    
    public String mostrarNoLeidoPrimero(ArrayList<Correos>cor){
        boolean most=porLeer(cor);
        String mensaje;
        for(Correos corre: cor){
            if(most){
                mensaje=corre.getMensaje();
                corre.setLeido(true);
                return mensaje;
            }
        }
        return "Ninguno por leer";
    }
    
    
    public void mostrar(ArrayList<Correos> cor,int posicion){
        System.out.println(cor.get(posicion-1));
        Correos comprobacion=cor.get(posicion-1);
        if (comprobacion.getLeido()==false){
            comprobacion.setLeido(true);
        }

    }
    public void eliminar(ArrayList<Correos>cor,int posicion){
        for(Correos corre:cor){
            if(cor.contains(posicion-1)){
                cor.remove(corre);
            }
        }
    }
}
