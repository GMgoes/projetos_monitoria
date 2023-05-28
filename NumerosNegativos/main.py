array = [];
count = 0;
for i in range(5):
    number = int(input());
    if(number < 0):
        count += 1;
    array.append(number);

print(f'Os números são: {array} e possuí: {count} números negativos')
