int; angulo1 = 0
int; angulo2 = 0
int; angulo3 = 0
int; suma = 0

angulo1 = int (input("Escriba el primer angulo del triangulo: "))
angulo2 = int (input("Escriba el segundo angulo del triangulo: "))
angulo3 = int (input("Escriba el tercer angulo del triangulo: "))

suma = angulo1 + angulo2 + angulo3

if suma == 90:
    print ("El triangulo es de angulo recto")
else: 
    if suma >90 and suma <180:
        print ("El triangulo es de angulo obtuso")
    else:
        if suma <90:
            print ("El triangulo es de angulo agudo")