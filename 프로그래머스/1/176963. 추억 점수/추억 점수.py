def solution(name, yearning, photo):
    answer = []
    
    people = {}
    for i in range(len(name)):
        people[name[i]] = yearning[i]
        
    # print(people)
    for pic in photo:
        total = 0
        for user in pic:
            for dic in people.items():
                if dic[0] == user:
                    total += dic[1]
        answer.append(total)
    return answer