fracao_um = input();
fracao_dois = input();

array_one = list(fracao_um)
array_two = list(fracao_dois)
array_three = list();

for i in range(len(array_one)+1):
    array_three.append(0);

for i in range(len(array_one)):
    array_one[i] = int(array_one[i])
    array_two[i] = int(array_two[i])
    
array_one.reverse();
array_two.reverse();

for i in range(len(array_one)):
    if(array_three[i]):
        soma = array_one[i] + array_two[i] + array_three[i];
    else:
        soma = array_one[i] + array_two[i];
    if(soma >= 10):
        if(soma - 10 == 0):
            passou = 1;
        else:
            passou = soma - 10;
        soma -= 10;
        array_three[i + 1] = passou;
    array_three[i] = soma;

array_three.reverse()
print(array_three)