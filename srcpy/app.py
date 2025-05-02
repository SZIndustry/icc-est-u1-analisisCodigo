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

