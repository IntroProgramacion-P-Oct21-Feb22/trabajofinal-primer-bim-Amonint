int; numero1=0
int; numero2=0
int; numero3=0
n1 = int(input("Ingrese el primer numero"))
n2 = int(input("Ingrese el segundo numero"))
n3 = int(input("Ingrese el tercer numero"))
while (numero1 == numero2 or numero2 == numero3 or numero3 == numero1):
        print("Ingrese numeros distintos ERROR")
        n1 = int(input("Ingrese el primer numero"))
        n2 = int(input("Ingrese el segundo numero"))
        n3 = int(input("Ingrese el tercer numero"))
if (numero1 > numero2 and numero1 > numero3):
    print("El numero mayor es: ",n1)
else:
    if(numero2 > numero1 and numero2 > numero3):
        print("El numero mayot es: ",n2)
    else:
         if(numero3 > numero1 and numero3 > numero2):
            print ("El numero mayor es: ",n3)