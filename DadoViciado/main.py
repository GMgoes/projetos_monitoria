array = [0,0,0,0,0,0]

n = int(input());

for i in range(n):
    number = int(input());
    array[number - 1] += 1;

for i in range(n):
    print(f'O número: {i + 1} saiu {array[i]} vezes')