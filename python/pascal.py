a=int(input("Entre un nombre:\n"))
# i et j les compteurs
#i la ligne et j la position 
for i in range(a+1):
    coef=1 #la premiere case de chaque ligne sera toujour 1
    for j in range(i+1):
        print(coef)
        coef = coef*(i-j)//(j+1)
print()

