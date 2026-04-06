def check(answers, arr):
    count = 0
    
    for idx in range(len(answers)):
        if answers[idx] == arr[idx % len(arr)]:
            count += 1
    return count

def solution(answers):
    answer = []
    
    sp1 = [1,2,3,4,5]
    sp2 = [2,1,2,3,2,4,2,5]
    sp3 = [3,3,1,1,2,2,4,4,5,5]
    
    maxnum = max(check(answers, sp1), max(check(answers, sp2), check(answers, sp3)))
    
    if maxnum == check(answers, sp1):
        answer.append(1)
    
    if maxnum == check(answers, sp2):
        answer.append(2)
    
    if maxnum == check(answers, sp3):
        answer.append(3)
        
    return answer