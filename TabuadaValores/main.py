array = [];

for i in range(20):
    number = int(input());
    array.append(number);

for number in array:
    print(f'Exibindo a tabuada do: {number}');
    for i in range(0,number + 1):
        print(f'{number} * {i} é: {i*number}');