import sys
import heapq

input = sys.stdin.readline

t = int(input().strip())

for _ in range(t):
    q = int(input().strip())

    min_heap = []
    max_heap = []
    dic = dict()

    for i in range(q):
        temp = input().strip().split()

        char = temp[0]
        num = int(temp[1])

        if char == 'I':
            heapq.heappush(min_heap, num)
            heapq.heappush(max_heap, -num)
            if num in dic.keys():
                # 중복 갯수 존재 표시
                dic[num] += 1
            else:
                # 개수 1개 들어감 표시
                dic[num] = 1

        elif char == 'D':
            if num == 1:
                while max_heap:
                    # 이 값은 삭제된 값이라는 것을 알려줌
                    if dic[-max_heap[0]] == 0:
                        heapq.heappop(max_heap)
                    else:
                        break

                # 안에 최댓값을 찾아야하니까 갯수 1개 제거
                if max_heap:
                    dic[-heapq.heappop(max_heap)] -= 1

            elif num == -1:
                while min_heap:
                    if dic[min_heap[0]] == 0:
                        heapq.heappop(min_heap)
                    else:
                        break

                if min_heap:
                    dic[heapq.heappop(min_heap)] -= 1

    # 비어있는 경우가 아니라면 최대, 최소를 찾아야하므로 재확인
    while max_heap:
        if dic[-max_heap[0]] == 0:
            heapq.heappop(max_heap)
        else:
            break

    while min_heap:
        if dic[min_heap[0]] == 0:
            heapq.heappop(min_heap)
        else:
            break

    if not min_heap:
        print("EMPTY")
    else:
        max_num = -heapq.heappop(max_heap)
        min_num = heapq.heappop(min_heap)

        print(max_num, min_num)