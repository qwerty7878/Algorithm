words = list(input())
# print(words)

result = []
while words:
    word = ''.join(words)
    # print(word)
    result.append(word)
    words.pop(0)

result.sort()
print('\n'.join(result))