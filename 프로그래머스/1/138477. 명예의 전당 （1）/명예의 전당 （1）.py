import heapq

def solution(k, score):
    answer = []
    heap = []
    
    for num in score:
        heapq.heappush(heap, num)
        
        if len(heap) > k:
            heapq.heappop(heap)
            
        answer.append(heap[0])
    return answer