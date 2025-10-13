alphabet = [0] * 26
word = input()

for char in word:
    alphabet[ord(char) - 97] += 1
print(*alphabet)