def solution(clothes):
    answer = 1
    dic = {}
    
    for k, v in clothes:
#         타입별 저장
        if v not in dic:
            dic[v] = [k]
        else:
            dic[v].append(k)
            
#             타입별 옷 리스트 출력 및 경우의 수 구하기
    for k, v in dic.items():
#         안입는 경우 + 1
        answer *= (len(v) + 1)
#     다 벗은 경우 -1
    return answer - 1