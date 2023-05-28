array = []
ocorrencias = [];
aux = 0;

n = int(input());

for i in range(n):
    number = float(input())
    array.append(number);

for element in array:
    for i in range(n):
        if(element == array[i]):
            aux += 1;
    print(f'O elemento {element} ocorre {aux} vezes no vetor')
    aux = 0;