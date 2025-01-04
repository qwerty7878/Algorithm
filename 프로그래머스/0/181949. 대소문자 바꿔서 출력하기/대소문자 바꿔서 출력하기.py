str = input()
arr = []
for i in str:
    if i.islower():
        arr.append(i.upper())
    else:
        arr.append(i.lower())
        
for i in arr:
    print(i,end='')