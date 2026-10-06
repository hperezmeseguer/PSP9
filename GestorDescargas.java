//Clase que gestiona las 4 descargas
public class GestorDescargas {
    
    public static void main (String[] args){

        //Crea los objetos Descarga con el nombre de cada archivo
        Descarga descarga1 = new Descarga("cuarzos.png");
        Descarga descarga2 = new Descarga("meditacion.mp4");
        Descarga descarga3 = new Descarga("mantras.mp3");
        Descarga descarga4 = new Descarga("horoscopo.pdf");

        //Asigna un nombre a cada hilo
        descarga1.setName("Descarga-cuarzos.png");
        descarga2.setName("Descarga-meditacion.mp4");
        descarga3.setName("Descarga-mantras.mp3");
        descarga4.setName("Descarga-horoscopo.pdf");

        long inicio = System.currentTimeMillis();

        descarga1.start();
        descarga2.start();
        descarga3.start();
        descarga4.start();

        try{

            descarga1.join();
            descarga2.join();
            descarga3.join();
            descarga4.join();

        } catch (InterruptedException e){
            e.printStackTrace();
        }

        long fin = System.currentTimeMillis();

        long tiempoReal = fin - inicio;

        long tiempoAcumulado = descarga1.getTiempoTotal() +
                               descarga2.getTiempoTotal() +
                               descarga3.getTiempoTotal() +
                               descarga4.getTiempoTotal();

        System.out.println("Todas las descargas han terminado");
        System.out.println("Tiempo real: " + tiempoReal + "ms");
        System.out.println("Tiempo si se descargaran una detrás de otra: " + tiempoAcumulado + "ms");

    }
}
