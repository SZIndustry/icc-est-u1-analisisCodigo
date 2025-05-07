import matplotlib.pyplot as plt
import benchmarking as bm
from metodos_ordenamiento import MetodosOrdenamiento

if __name__ == "__main__":
    print("\nEUREKA!\n")

    bench = bm.Benchmarking()
    mO = MetodosOrdenamiento()

    #tam = 10000
    tamanios = [5000, 10000, 15000]
    resultado = []


    for tam in tamanios:
        arreglo_base = bench.build_arreglo(tam)

        metodos = {
            "burbuja": mO.sort_bubble,
            "burbuja_mejorado": mO.sort_burbuja_mejorado_optimizado,
            "seleccion": mO.sort_seleccion,
            "shell": mO.shell_sort

        }

        for nombre, metodo_inc in metodos.items():
            tiempo_resultado = bench.medir_tiempo(metodo_inc, arreglo_base)

            tupla_resultado = (tam, nombre, tiempo_resultado)
            resultado.append(tupla_resultado)

    for tam, name, tiempo in resultado:
        print(f"Tamano: {tam}, Nombre: {name}, Tiempo: {tiempo:.6f} segundos")


    #prepara datos para ser graficos
    # crear diccionario o map para almacenar resultados por metodo
    tiempos_by_metodo = {
        "burbuja" : [],
        "burbuja_mejorado" :[],
        "seleccion" :[],
        "shell" : []
    }

    for tam, nombre, tiempo in resultado:
        tiempos_by_metodo[nombre].append(tiempo)

    plt.figure(figsize=(10,6))

    #graficar los tiempos de ejecucion para cada caso
    for ombre, tiempos in tiempos_by_metodo.items():
        plt.plot(tamanios, tiempos, label = nombre, marker= "o")

    #agregar parametro
    plt.title("comparacion de tiempo para cada metodo")
    plt.xlabel("Tamanio de los arreglos")
    plt.ylabel("Tiempo de ejecucion")

    plt.legend()
    plt.show()

    x = [1, 2, 3, 4, 5]
    y = [2, 4, 6, 8, 10]

    #grafico de lineas
    plt.plot(x,y, label = 'linea', color = 'Blue')
    plt.title("mi primer grafico")
    plt.xlabel("eje de las x")
    plt.ylabel("eje de las y")

    plt.legend()
    plt.show()

