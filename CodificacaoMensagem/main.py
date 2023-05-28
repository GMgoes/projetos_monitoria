array = [];
mensagem = input();
codified = '';

if(len(mensagem) % 2 != 0):
    mensagem += '#';

for i in range(len(mensagem)):
    if(i % 2 == 0):
        codified += mensagem[i+1];
        codified += mensagem[i];

print(codified)