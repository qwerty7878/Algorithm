n = int(input())
word = input()
aeiou = ['a','e','i','o','u']
count = 0

for char in word:
    if char in aeiou:
        count += 1

print(count)