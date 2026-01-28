def solution(s):
    answer = ''
    words = s.split(' ')
    temp = []
    print(words)
    for word in words:
        newWord = ''
        for idx in range(len(word)):
            if (idx + 1) % 2 == 0:
                newWord += word[idx].lower()
            else:
                newWord += word[idx].upper()
        temp.append(newWord)
    answer = ' '.join(temp)
    return answer