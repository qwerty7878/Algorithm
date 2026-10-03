def solution(answers):
    answer = []
    
    sol_1 = [1,2,3,4,5]
    sol_2 = [2,1,2,3,2,4,2,5]
    sol_3 = [3,3,1,1,2,2,4,4,5,5]
    
    cnt_1 = cnt_check(sol_1, answers)
    cnt_2 = cnt_check(sol_2, answers)
    cnt_3 = cnt_check(sol_3, answers)
    
    max_num = max(cnt_1, max(cnt_2, cnt_3))
    
    if max_num == cnt_1:
        answer.append(1)
    if max_num == cnt_2:
        answer.append(2)
    if max_num == cnt_3:
        answer.append(3)
    
    return answer

def cnt_check(array, answers):
    cnt = 0
    for idx in range(len(answers)):
        if array[idx % len(array)] == answers[idx % len(answers)]:
            cnt += 1
    return cnt