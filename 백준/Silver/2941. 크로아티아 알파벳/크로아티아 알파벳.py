alpha = ['c=','c-','dz=','d-','lj','nj','s=','z=']
str = input()

for i in alpha:
    if i in str:
        str = str.replace(i,'*')

print(len(str))