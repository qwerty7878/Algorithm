str = input()
# if 'c=' in str:
#     str = str.replace('c=','@')
# if 'c-' in str:
#     str = str.replace('c-','@')
# if 'dz=' in str:
#     str = str.replace('dz=','@')
# if 'd-' in str:
#     str = str.replace('d-','@')
# if 'lj' in str:
#     str = str.replace('lj','@')
# if 'nj' in str:
#     str = str.replace('nj','@')
# if 's=' in str:
#     str = str.replace('s=','@')
# if 'z=' in str:
#     str = str.replace('z=','@')
# print(len(str))

alpha = ['z=', 's=', 'nj', 'lj', 'd-', 'dz=', 'c-', 'c=']
for i in alpha[::-1]:
    str = str.replace(i, '@')

print(len(str))