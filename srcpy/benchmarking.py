import time
import random
from metodos_ordenamiento import MetodosOrdenamiento

class Benchmarking:

    # Constructor
    def __init__(self):
        pass
    def metodo(self):
        print("BenchMarking")
        self.mO = Metodos_ordenamiento()
        arreglo = self.build_arreglo(10000)

        tarea = lambda: self.mO.sort_bubble(arreglo)
        tarea2 = lambda: self.mO.sort_burbuja_mejorado_optimizado(arreglo)
        tarea3 = lambda: self.mO.sort_seleccion(arreglo)
        tarea4 = lambda: self.mO.shell_sort(arreglo)

        tiemporN = self.contar_con_nano_time(tarea)
        tiemporN2 = self.contar_con_nano_time(tarea)
        tiemporN3 = self.contar_con_nano_time(tarea)
        tiemporN4 = self.contar_con_nano_time(tarea)

        #tiemporM = self.contar_con_current_time_miles(tarea)

        #print(f"Tiempor en milisegundos {tiemporM}")
        print(f"Tiempo en nanosegundos bubble {tiemporN}")
        print(f"Tiempo en nanosegundos bubble mejorado {tiemporN2}")
        print(f"Tiempo en nanosegundos seleccion {tiemporN3}")
        print(f"Tiempo en nanosegundos metodo shell {tiemporN4}")

    def medir_tiempo(self, funcion, array):
        inicio = time.perf_counter()
        funcion(array)
        fin = time.perf_counter()

        return fin - inicio
    
    def build_arreglo(self, tamano):
        arreglo = []

        for i in range(tamano):
            numero = random.randint(0, 9999)
            arreglo.append(numero)

        return arreglo
    
    def contar_con_current_time_miles(self, tarea):
        inicio = time.time() 
        tarea()
        fin = time.time()
        return (fin - inicio)
        
    def contar_con_nano_time(self, tarea):
        inicio = time.time_ns()  
        tarea()
        fin = time.time_ns()  
        return (fin - inicio) / 1_000_000_000.0
