def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()
    for p_runner, c_runner in zip(participant, completion):
        if p_runner != c_runner:
            answer = p_runner
            return answer
    
    answer = participant[-1]
    return answer