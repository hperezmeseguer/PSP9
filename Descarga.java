public class Descarga extends Thread {

    private String nombreArchivo;
    private int tiempoBloques;

    public Descarga(String nombreArchivo){
        
        this.nombreArchivo = nombreArchivo;
        this.tiempoBloques = tiempoAleatorio();
    }

    private int tiempoAleatorio(){
        
        return (int) (Math.random() * 400) + 101;
    }
}
