def solution(citations):
    citations.sort(reverse=True)
    
    h = 0
    while True:
        answer = 0
        
        for citation in citations:
            if citation >= h:
                answer += 1
        
        if answer <= h:
            return answer
        else:
            h += 1