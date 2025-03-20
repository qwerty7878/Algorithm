def solution(s):
    answer = s.split(' ')
    word = ''
    for i in answer:
        if i:
            word += i[0].upper() + i[1:].lower() + ' '
        else:
            word += ' '
    return word[:-1]