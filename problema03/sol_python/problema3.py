str; nombre= "" 
int; tipoempleado=0
float; costoxh = 0
float; costoxhextra = 0
float; horastrabajadas = 0
float; cuota1 = 1.5
float; cuota2 = 2
float; cuota3 = 2.5
float; cuota4 = 3
float; totalpagar = 0
str; datos = ""

nombre = str (input("Escriba el nombre del empleado: "))

tipoempleado = int (input("Escriba el tipo de empleado: "))

horastrabajadas = float (input("Escriba el numero de horas trabajadas: "))

costoxh = float (input("Escriba la cuota por horas: "))

sueldo = horastrabajadas * costoxh

if (tipoempleado ==1 and horastrabajadas >40):
    sueldo = sueldo * cuota1
else:
    if (tipoempleado ==2 and horastrabajadas >40):
        sueldo = sueldo * couta2
    else:
        if (tipoempleado ==3 and horastrabajadas >40):
            sueldo = sueldo * couta3
            else:
                if (tipoempleado ==4 and horastrabajadas >40):
                sueldo = sueldo * couta3
        
print("Sueldo: ",totalpagar)