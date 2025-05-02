class MetodosOrdenamiento:
    def sort_bubble(self, array):
        arreglo = array.copy()

        n = len(arreglo)

        for i in range(n):
            for j in range(i + 1, n):
                if arreglo[i] > arreglo[j]:
                    arreglo[i], arreglo[j] = arreglo[j], arreglo[i]
    
    def sort_burbuja_mejorado_optimizado(self, array):
        arreglo = array.copy()
        n = len(arreglo)

        for i in range(n):
            condicion = False
            
            for j in range(i + 1, n-i-1):
                if arreglo[j] > arreglo[j+1]:
                    arreglo[j], arreglo[j+1] = arreglo[j+1], arreglo[j]
                    condicion = True
            
            if not condicion:
                break
        
        return arreglo

    def sort_seleccion(self, array):
        arreglo = array.copy()
        n = len(arreglo)

        for i in range(n):
            index_min = i
            
            for j in range(i+1, n):
                if arreglo[j] < arreglo[index_min]:
                    index_min = j
            
            arreglo[i], arreglo[index_min] = arreglo[index_min], arreglo[i]
        
        return arreglo

    def shell_sort(slef, array):
        arreglo = array.copy()
        n = len(arreglo)

        gap = n // 2  # Comenzamos con un gap grande, luego lo reducimos
        
        while gap > 0:
            # Realizamos un ordenamiento por inserción para cada sublista definida por el gap
            for i in range(gap, n):
                temp = arreglo[i]
                j = i
                # Insertamos el elemento en su posición adecuada dentro de la sublista
                while j >= gap and arreglo[j - gap] > temp:
                    arreglo[j] = arreglo[j - gap]
                    j -= gap
                arreglo[j] = temp
            
            # Reducimos el tamaño del gap
            gap = gap // 2

        return arreglo



