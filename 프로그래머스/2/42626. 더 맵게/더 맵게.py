import heapq

def solution(scoville, K):
    answer = 0
#     기존 리스트 -> 힙으로 변환
    heapq.heapify(scoville)
    # print(scoville)
    while any(num < K for num in scoville):
#         2개의 수를 뽑을 수 없는 경우
        if len(scoville) < 2:
            return -1
#         첫번쨰와 두번째 수 추출
        first = heapq.heappop(scoville)
        # print(first)
        second = heapq.heappop(scoville)
#         섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        newScovilleNum = first + (second * 2)
        heapq.heappush(scoville, newScovilleNum)
        answer += 1
    return answer
    