array = [];
flag = False;

while(len(array) != 200):
    inp = input();
    if(inp == 'FIM'):
        break;
    else:
        array.append(inp)

while(True):
    flag = False;
    inp = input();
    if(inp == 'FIM'):
        break;
    else:
        for element in array:
            if(element.lower() == inp.lower()):
                flag = True;
                break;
        if(flag):
            print('Usuario autorizado');
        else:
            print('Usuario não autorizado');