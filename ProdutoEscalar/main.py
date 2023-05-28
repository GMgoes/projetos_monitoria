array_one = [];
array_two = [];
somatorio = 0;

n = int(input());

for i in range(n):
    number = int(input())
    array_one.append(number);

for i in range(n):
    number = int(input())
    array_two.append(number);

for i in range(n):
    mult = array_one[i] * array_two[i];
    somatorio += mult;

print(somatorio)