array = [];
array_half = [];
array_reverse = [];
array = input();
array = array.split(',');
half = int(len(array)/ 2);

for i in range(half,len(array)):
    array_half.append(array[i]);

for element in array_half[::-1]:
    array_reverse.append(element);

j = -1;
for i in range(half,len(array)):
    j += 1;
    array[i] = array_reverse[j];

print(array);