int; trajes = 0
float; preciounitario = 0
float; subtotal = 0
float; precioFinal = 0
float; descuento = 0
int; porcentaje1 =20
int; porcentaje2 = 25
int; porcentaje3 = 40
int; porcentaje4 = 50

trajes = int (input("Escriba el numero de trajes a comprar"))

preciounitario = float (input("Escriba el valor unitario"))

subtotal = preciounitario * trajes

if trajes == 1:
    descuento = porcentaje1 * subtotal/100
    precioFinal = subtotal - descuento
else:
    if trajes == 2:
        descuento = porcentaje2 * subtotal/100
       precioFinal = subtotal - descuento
    else:
        if trajes == 3:
            descuento = porcentaje3 * subtotal/100
            precioFinal = subtotal - descuento
        else:
            if trajes >3:
                descuento = porcentaje4 *subtotal/100
                precioFinal = subtotal - descuento


print("Subtotal",subtotal)
print("Descuento",descuento)
print("Valor Total",precioFinal)