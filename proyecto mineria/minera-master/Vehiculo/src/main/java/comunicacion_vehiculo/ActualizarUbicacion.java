package comunicacion_vehiculo;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import ubicacion.Ubicacion;
import ubicacion.Vehiculo;


public class ActualizarUbicacion {

    private final Vehiculo vehiculo;
    private final Timer timer;

    public ActualizarUbicacion(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        timer = new Timer();
        
        timer.scheduleAtFixedRate(new NuevaUbicacion(vehiculo), 0, 5000);

    }
}

class NuevaUbicacion extends TimerTask {

    private final Vehiculo vehiculo;  
    Send send = new Send();

    public NuevaUbicacion(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void run() {        
        send.setV(vehiculo);
        movimiento();
        send.mandarUbi(vehiculo);
    }

    private void movimiento() {
        double lon = vehiculo.getUbi().getLongitud();
        double lat = vehiculo.getUbi().getLatitud();
        double alt = vehiculo.getUbi().getAltitud();
        
        Ubicacion arrayObjetos[]=new Ubicacion[20];
 
        //Creamos objetos en cada posicion
        arrayObjetos[0]=new Ubicacion(27.510349, -109.930412, 10);
        arrayObjetos[1]=new Ubicacion(27.506116, -109.930494, 10);
        arrayObjetos[2]=new Ubicacion(27.501415, -109.930459, 10);
        arrayObjetos[3]=new Ubicacion(27.501432, -109.945413, 10);
        arrayObjetos[4]=new Ubicacion(27.501378, -109.960798, 10);
        arrayObjetos[5]=new Ubicacion(27.501270, -109.973665, 10);
        arrayObjetos[6]=new Ubicacion(27.494056, -109.973574, 10);
        arrayObjetos[7]=new Ubicacion(27.491142, -109.970209, 10);
        arrayObjetos[8]=new Ubicacion(27.490470, -109.960935, 10);
        arrayObjetos[9]=new Ubicacion(27.493895, -109.961007, 10);
        arrayObjetos[10]=new Ubicacion(27.493927, -109.953266, 10);
        arrayObjetos[11]=new Ubicacion(27.493831, -109.943090, 10);
        arrayObjetos[12]=new Ubicacion(27.493865, -109.930436, 10);
        arrayObjetos[13]=new Ubicacion(27.487156, -109.930540, 10);
        arrayObjetos[14]=new Ubicacion(27.482739, -109.930532, 10);
        arrayObjetos[15]=new Ubicacion(27.482767, -109.954878, 10);
        arrayObjetos[16]=new Ubicacion(27.482777, -109.962978, 10);
        arrayObjetos[17]=new Ubicacion(27.472158, -109.950648, 10);
        arrayObjetos[18]=new Ubicacion(27.493611, -109.945387, 10);
        arrayObjetos[19]=new Ubicacion(27.496828, -109.953264, 10);
        
        
        
        int min = 0;
		int max = 19;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
 
        //Recorremos el array para calcular la suma de salarios
 
//        int suma=0;
//        for (int i=0;i<arrayObjetos.length;i++){
//            suma+=arrayObjetos[i].getSalario();
//        }
//        System.out.println("La suma de salarios es "+suma);
//    }
        
        
        
                
                        
        
        Ubicacion ubi = new Ubicacion(arrayObjetos[value].getLongitud(), arrayObjetos[value].getLatitud(), arrayObjetos[value].getAltitud());
        this.vehiculo.setUbi(ubi);
        
    }
}
