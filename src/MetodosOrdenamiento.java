import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: el return devuelve un método vacío
    // Solución: modificar el return para que devuelva el arreglo ordenado
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {  
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;  
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: en el segundo for, el índice debe empezar en 0
    // Solución: se cambia el índice y el signo para el tipo de orden
    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {  
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo; 
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: en el bucle for el índice sale del rango
    // Solución: agregar el límite del recorrido correctamente
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) { 
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;  
    }

    // Método de selección con errores
    // Error encontrado: falta el return para devolver el arreglo ordenado
    // Solución: agregar el return al final del método
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambio de elementos
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;  
    }

    // Método de selección con errores
    // Error encontrado: el segundo for tiene un signo incorrecto en la condición
    // Solución: corregir el signo en el bucle interno
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {  
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambio de elementos
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo; 
    }

    // Método de selección con errores
    // Error encontrado: el intercambio de elementos no es correcto
    // Solución: corregir la asignación en el intercambio de elementos
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambio de elementos
            int smallerNumber = arreglo[i]; 
            arreglo[i] = arreglo[indiceMinimo];  
            arreglo[indiceMinimo] = smallerNumber; 
        }
        return arreglo; 
    }

    // Método de inserción con errores
    // Error encontrado: el bucle interno está incorrecto y el return
    // Solución: corregir el índice y la lógica en el bucle interno
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {  
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo; 
    }

    // Método de inserción con errores
    // Error encontrado: el bucle interno tiene un error de índice
    // Solución: corregir el índice en el bucle interno
    public int[] insercionSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];
            int i = j - 1;
    
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;  
        }
        return arreglo;  
    }

    // Método de inserción con errores
    // Error encontrado: el bucle interno tiene un error de índice y el último return está incorrecto
    // Solución: corregir la lógica del índice y el return final
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j;

            while (i > 0 && arreglo[i - 1] > key) {  
                arreglo[i] = arreglo[i - 1];
                i--;
            }
            arreglo[i] = key;
        }
        return arreglo;
    }
}
