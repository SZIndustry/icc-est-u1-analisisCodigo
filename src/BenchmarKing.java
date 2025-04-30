import java.util.Random;

public class BenchmarKing {

    private MetodosOrdenamiento mOrdenamiento;

    public BenchmarKing() {
        mOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(100000);

        // Warm up JVM
        mOrdenamiento.burbujaTradicional(arreglo.clone());

        Runnable tarea = () -> mOrdenamiento.burbujaTradicional(arreglo.clone());

        double tiempoDuracionMilis = medirConCurrentTimeMillis(tarea);
        double tiempoDuracionNano = medirConNanoTime(tarea);

        System.out.println("Tiempo en milisegundos: " + tiempoDuracionMilis);
        System.out.println("Tiempo en nanosegundos: " + tiempoDuracionNano);
    }

    private int[] generarArregloAleatorio(int tamaño) {
        int[] arreglo = new int[tamaño];
        Random random = new Random();
        for(int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(100000);
        }
        return arreglo;
    }   

    private double medirConCurrentTimeMillis(Runnable tarea) {
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return (fin - inicio)/1000.0; 
    }

    private double medirConNanoTime(Runnable tarea) {
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        return (fin - inicio) / 1_000_000.0; 
    }

    public static void main(String[] args) {
        new BenchmarKing();
    }
}