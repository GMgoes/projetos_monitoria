alunos = []
informacoes = []

while(True):
    codigo = input();
    if(int(codigo) == 0):
        break;
    else:
        informacoes.append(codigo);
        for i in range(1,4):
            nota = int(input());
            informacoes.append(nota)
    alunos.append(informacoes);
    informacoes = [];

print(alunos)