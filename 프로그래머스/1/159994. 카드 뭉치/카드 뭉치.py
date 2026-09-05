def solution(cards1, cards2, goal):
    rev_cards1 = cards1[::-1]
    rev_cards2 = cards2[::-1]
    
    for char in goal:
        if rev_cards1 and char == rev_cards1[-1]:
            rev_cards1.pop()
        elif rev_cards2 and char == rev_cards2[-1]:
            rev_cards2.pop()
        else:
            return 'No'
        
    return 'Yes'