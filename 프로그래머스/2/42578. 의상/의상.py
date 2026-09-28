def solution(clothes):
    answer = 1
    dic = {}
    
    for cloth_sort, idx in clothes:
        dic[idx] = dic.get(idx, 0) + 1
        
    for k, v in dic.items():
        answer *= (v + 1)
    
    return answer - 1