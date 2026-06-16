def solution(spell, dic):
    answer = 2
    for word in dic:
        check = spell.copy()
        for char in word:
            if char in check:
                check.remove(char)
            else:
                continue
    
        if not check:
            answer = 1
            break
    return answer