//Clase que simula la descarga de un archivo mediante un hilo
public class Descarga extends Thread {

    private String nombreArchivo;
    private int tiempoBloques;
    private long tiempoTotal;

    //Constructor de un objeto Descarga que recibe el nombre del archivo
    //Llama a un método que establece el tiempo aleatorio por bloque
    public Descarga(String nombreArchivo){
        
        this.nombreArchivo = nombreArchivo;
        this.tiempoBloques = tiempoAleatorio();
    }

    //Genera un tiempo aleatorio entre 100 y 500 ms
    //Convierte el resultado a int
    private int tiempoAleatorio(){
        
        return (int) (Math.random() * 401) + 100;
    }

    //Ejecuta la descarga, muestra el progreso y calcula el tiempo total
    @Override 

    public void run(){

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++){
            
            try {
                Thread.sleep(tiempoBloques);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("[" + nombreArchivo + "] " + (i * 10) + "%");
        }

        long fin = System.currentTimeMillis();
        tiempoTotal = fin - inicio;

        System.out.println("[" + nombreArchivo + "] completada en " + tiempoTotal + "ms");
    }

    //Devuelve el tiempo total de tardanza de la descarga
    public long getTiempoTotal(){
        return tiempoTotal;
    }
}
