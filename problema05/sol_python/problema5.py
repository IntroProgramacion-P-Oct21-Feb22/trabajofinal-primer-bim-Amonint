float; x = float
float; y = float

float; x = float (input("Ingrese la cordenada X"))

float; y = float (input("Ingrese la cordenada Y"))

if x > 0 and y > 0:
    print("Las cordenadas estan ubicadas en el primer cuadrante")
else:
    if x <0 and y >0:
        print("Las cordenadas estan ubicadas en el segundo cuadrante")
    else:
        if x <0 and y <0:
            print("Las cordenadas estan ubicadas en el tercer cuadrante")
        else:
            if x >0 and y <0:
                print("Las cordenadas estan ubicadas en el cuarto cuadrante"