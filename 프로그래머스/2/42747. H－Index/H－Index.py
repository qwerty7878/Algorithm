def solution(citations):
    answer = 0
#     내림차순 정렬
    citations.sort(reverse=True)
    for i in citations:
        count = 0
        for j in citations:
            if i <= j:
                count += 1
            answer = max(min(count, i), answer)
    return answer