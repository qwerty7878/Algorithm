import sys
from collections import deque

t = int(sys.stdin.readline())
for i in range(t):
    #   큐 크기, 필요로 하는 사이클
    n,m = map(int, sys.stdin.readline().split())
    q = deque(list(map(int, sys.stdin.readline().split())))

    cnt = 0
    #   큐를 돌면서
    while q:
        #   우선순위 첫번쨰
        maxN = max(q)
        #   현재 맨 첫번째 프린팅 되는 수
        front = q.popleft()
        #   한 사이클이 돌아갔다
        m -= 1

        #   뽑은 값이 최대값이면
        if front == maxN:
            #   순서가 올라감
           cnt += 1
            #   아직 뽑아야하는 사이클이 남았으면 더 진행하지만 만약 모두 뽑은경우라면
           if m < 0:
               #    값 출력하기
               print(cnt)
               break
        #   근데 만약 값이 아니라면
        else:
            #   다시 큐에 넣어주면서 큐 크기 유지해주기
            q.append(front)
            #   근데 만약 이미 돌아야하는 사이클을 다 돌았음에도 최대값읆 못찾았으면
            #   사이클 재설정이 필요함
            if m < 0:
                #   중요도가 더 높은 문서가 남아있으니 다시 돌아야 하므로
                #   맨 뒤로 이동해야 하므로 m == len(큐) - 1
                m = len(q) - 1