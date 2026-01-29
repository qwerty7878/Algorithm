def solution(cards1, cards2, goal):
    answer = 'Yes'
    
    for word in goal:
        if word in cards1:
            if cards1[0] == word:
                cards1.remove(word)
            else:
                answer = "No"
                break
        else:
            if cards2[0] == word:
                cards2.remove(word)
            else:
                answer = "No"
                break
    return answer