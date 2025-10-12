str = input()
for char in str:
    if char.islower():
        char = char.upper()
    else:
        char = char.lower()
    print(char,end='')