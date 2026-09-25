def solution(a, b):
    
    week = ['FRI', 'SAT', 'SUN' ,'MON', 'TUE', 'WED', 'THU']
    day = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    total = b - 1
    for idx in range(1, a):
        total += day[idx]
        
    return week[total % 7]