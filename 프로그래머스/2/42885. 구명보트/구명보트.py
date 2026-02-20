def solution(people, limit):
    people.sort()
    answer = 0
    first = 0
    second = len(people) - 1
    
    while first <= second:
        if people[first] + people[second] <= limit:
            answer += 1
            first += 1
            second -= 1
        else:
            answer += 1
            second -= 1
            
    return answer