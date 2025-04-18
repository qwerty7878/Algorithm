alpha = input()
if alpha.islower():
    new = alpha.upper()
    print(f'{alpha}(ASCII: {ord(alpha)}) => {new}(ASCII: {ord(new)})')
elif alpha.isupper():
    new = alpha.lower()
    print(f'{alpha}(ASCII: {ord(alpha)}) => {new}(ASCII: {ord(new)})')