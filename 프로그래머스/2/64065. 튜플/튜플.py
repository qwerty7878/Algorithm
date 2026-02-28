def solution(s):
    answer = []
    s = s[2:-2]
    arr = s.split('},{')
    # print(arr)
    
    dic = dict()
    for i in arr:
        if ',' in i:
            temp = i.split(',')
            for j in temp:
                dic[j] = dic.get(j, 0) + 1
        else:
            dic[i] = dic.get(i, 0) + 1
    # print(dic)
    
    maxlist = sorted(dic.values(), reverse=True)
    # print(maxlist)
    
    for num in maxlist:
        for k, v in dic.items():
            if num == v:
                answer.append(int(k))
    return answer