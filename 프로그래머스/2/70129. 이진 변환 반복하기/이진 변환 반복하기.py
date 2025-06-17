def solution(s):
    answer = []
    zero = 0
    cnt = 0
    while True:
        zero += s.count('0')
        # print(zero)
        temp = ''
        for i in s:
            if i == '1':
                temp += i
        # print(temp)
        s = format(len(temp),'b')
        # print(s)
        cnt += 1

        if s == '1':
            break
    
    answer.append(cnt)
    answer.append(zero)
    return answer