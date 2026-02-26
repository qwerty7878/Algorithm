def solution(s):
    answer = []
    
    zero = 0
    length = len(s)
    removezero = 0
    count = 0
    
    while True:
        zero += s.count('0')
        length = len(s) - s.count('0')
        removezero = bin(length)[2:]
        s = str(removezero)
        count += 1
        
        if str(removezero) == '1':
            break
            
    # print(zero, count)
    return [count, zero]