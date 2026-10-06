public class GestorDescargas {
    
    public static void main (String[] args){

        Descarga descarga1 = new Descarga("cuarzos.png");
        Descarga descarga2 = new Descarga("meditacion.mp4");
        Descarga descarga3 = new Descarga("mantras.mp3");
        Descarga descarga4 = new Descarga("horoscopo.pdf");

        descarga1.setName("Descarga-cuarzos.png");
        descarga2.setName("Descarga-meditacion.mp4");
        descarga3.setName("Descarga-mantras.mp3");
        descarga4.setName("Descarga-horoscopo.pdf");

        long inicio = System.currentTimeMillis();

        descarga1.start();
        descarga2.start();
        descarga3.start();
        descarga4.start();

        long fin = System.currentTimeMillis();

        long tiempoReal = fin - inicio;

    }
}
