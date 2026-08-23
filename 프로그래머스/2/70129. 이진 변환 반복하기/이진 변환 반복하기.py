def solution(s):
    answer = []
    
    rm_zero = 0
    count = 0
    
    while s != '1':
        rm_zero += s.count('0')
        s = s.replace('0', '')
        count += 1
        s = bin(len(s))[2:]
        # print(s)
        
    return [count, rm_zero]