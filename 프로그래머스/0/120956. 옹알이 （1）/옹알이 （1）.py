def solution(babbling):
    answer = 0
    word = ['aya', 'ye', 'ma', 'woo']
    
    for i in babbling:
        for j in word:
            if j in i:
                i = i.replace(j,'*')
        if len(i) == i.count('*'):
            answer += 1
    return answer