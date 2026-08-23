def solution(n):
    answer = 0
    current = bin(n)[2:]
    ocnt = current.count('1')
    # print(ocnt)
    
    nextnum = n + 1
    while True:
        ncnt = bin(nextnum).count('1')
    # print(ncnt)
        if ncnt == ocnt:
            answer = nextnum
            break
        else:
            nextnum += 1
    return answer