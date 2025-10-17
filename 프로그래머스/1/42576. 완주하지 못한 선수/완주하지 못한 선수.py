def solution(participant, completion):
    answer = ''
    completion.sort()
    participant.sort()
    
    for p,c in zip(participant, completion):
        if p != c:
            return p
    return participant[-1]