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
        boolean leido;
        int lei=PedirDatos.entero("Introduzca 1 si el correo a sido leido, 0 si no:");
        if (lei==1){
            leido=true;
        }
        else{
            leido=false;
        }
        Correos corre=new Correos(correo,leido);
        cor.add(corre);
    }
    public void numeroDeCorreos(ArrayList<Correos> cor){
        JOptionPane.showMessageDialog(null,"Tiene "+cor.size()+ " correos");
    }
    public boolean porLeer(ArrayList<Correos> cor){
        for(Correos corre:cor){
            if(corre.getLeido()==false){
                return true;
            }
        }
        return false;
    }
    public void mostrarNoLeidoPrimero(ArrayList<Correos> cor){
        for(Correos corre:cor){
            if(corre.getLeido()==false){
                System.out.println(corre);
                corre.setLeido(true);
                break;
            }
        }
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
