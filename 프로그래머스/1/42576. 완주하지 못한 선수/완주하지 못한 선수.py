def solution(participant, completion):
    sort_participant = sorted(participant)
    sort_completion = sorted(completion)
    
    for idx in range(len(sort_completion)):
        if sort_completion[idx] == sort_participant[idx]:
            continue
        else:
            return sort_participant[idx]
    return sort_participant[-1]