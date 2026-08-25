def solution(people, limit):
    answer = len(people)
    sort_people = sorted(people)
    
    start_idx = 0
    end_idx = len(people) - 1
    
    while start_idx < end_idx:
        if sort_people[start_idx] + sort_people[end_idx] <= limit:
            answer -= 1
            start_idx += 1
            end_idx -= 1
        else:
            end_idx -= 1
        
    return answer