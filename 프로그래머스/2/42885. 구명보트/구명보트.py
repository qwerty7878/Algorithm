def solution(people, limit):
    answer = 0
    people.sort()
    
    start = 0
    end = len(people) - 1
    
    while start <= end:
        boat = people[start] + people[end]
        
        if boat <= limit:
            start += 1
            
        answer += 1
        end -= 1
    return answer