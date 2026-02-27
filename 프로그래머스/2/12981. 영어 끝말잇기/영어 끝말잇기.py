def solution(n, words):
    isvisited = []
    temp = words[0]
    
    isvisited.append(temp)
    for idx in range(1, len(words)):
        # print(words[idx])
        if words[idx][0] != temp[-1]:
            return [(idx % n) + 1, (idx // n) + 1]
        elif words[idx] in isvisited:
            return [(idx % n) + 1, (idx // n) + 1]
        else:
            isvisited.append(temp)
            temp = words[idx]
    return [0, 0]