def solution(s):
    answer = []
    
    turn = 0
    zerocnt = 0
    
    while True:
        if s == '1':
            return [turn, zerocnt]

        target = len(s) - s.count('0')
        zerocnt += s.count('0')
        s = str(bin(target))[2:]
        turn += 1
        
    return answer