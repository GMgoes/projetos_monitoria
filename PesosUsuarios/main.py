array = []
min_number = float('inf')

for i in range(5):
    peso = float(input())
    if(peso < min_number):
        min_number = peso;
    array.append(peso)

print(f'Os pesos são: {array} e o menor peso é {min_number}')
