def solution(answers):
    answer = []
    
    forgive_1 = [1,2,3,4,5]
    forgive_2 = [2,1,2,3,2,4,2,5]
    forgive_3 = [3,3,1,1,2,2,4,4,5,5]
    
    f1_count = 0
    f2_count = 0
    f3_count = 0
    
    for idx in range(len(answers)):
        if forgive_1[idx % len(forgive_1)] == answers[idx]:
            f1_count += 1
            
        if forgive_2[idx % len(forgive_2)] == answers[idx]:
            f2_count += 1
            
        if forgive_3[idx % len(forgive_3)] == answers[idx]:
            f3_count += 1
        
        if idx + 1 == len(answers):
            break

    most_collect = max(f1_count, max(f2_count,f3_count))
    forgivers = [f1_count, f2_count, f3_count]
    for idx in range(len(forgivers)):
        if forgivers[idx] == most_collect:
            answer.append(idx + 1)
    return answer