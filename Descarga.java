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

    @Override 

    public void run(){

        for (int i = 1; i <= 10; i++){
            
            try {
                Thread.sleep(tiempoBloques);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("[" + nombreArchivo + "] " + (i * 10) + "%");
        }
    }
}
