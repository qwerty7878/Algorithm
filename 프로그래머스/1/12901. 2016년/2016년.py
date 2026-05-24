def solution(a, b):
    answer = ''
    
    week = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    total = sum(days[:a - 1]) + b - 1
    answer = week[total % 7]
    return answer