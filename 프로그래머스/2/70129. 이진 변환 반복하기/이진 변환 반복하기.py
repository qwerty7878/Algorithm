def solution(s):
    answer = []
    zerocnt = 0
    cnt = 0
    
    while True:
        if s == '1':
            break
        else:
            zerocnt += s.count('0')
            s = s.replace('0', '')
            s = str(bin(len(s))[2:])
            cnt += 1

    answer.append(cnt)
    answer.append(zerocnt)
    
    return answer