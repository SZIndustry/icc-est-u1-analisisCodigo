import matplotlib.pyplot as plt 

x = [1, 2, 3, 4, 5]
y = [2, 4, 6, 8, 10]

#grafico de lineas
plt.plot(x,y, label = 'linea', color = 'Blue')
plt.title("mi primer grafico")
plt.xlabel("eje de las x")
plt.ylabel("eje de las y")

plt.legend()
plt.show()

