def solution(a, b):
    answer = ''
    
    week = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    total = b - 1
    for i in range(a - 1):
        total += day[i] 
    # print(total)
    
    answer = week[total % 7]
    return answer