def solution(k, score):
    answer = []
    li = []
    
    for num in score:
        if len(li) < k:
            if not li:
                li.append(num)
                answer.append(num)
            else:
                li.append(num)
                li.sort()
                answer.append(li[0])
        elif len(li) == k:
            if num > li[0]:
                li.remove(li[0])
                li.append(num)
                li.sort()
                answer.append(li[0])
            else:
                answer.append(li[0])
    return answer