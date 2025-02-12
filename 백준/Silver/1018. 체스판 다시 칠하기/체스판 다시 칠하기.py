n,m = map(int,input().split())

arr = [list(input()) for i in range(n)]
# 2차원 배열 문자열씩 저장
min_cnt = float('inf')
# 최대값 저장
for i in range(n - 7):
    for j in range(m - 7):
        # 8 * 8 만 뽑으니까 해당 범위를 제외한 나머지에서 진행하는 횟수
        cnt1 = 0
        cnt2 = 0

        for x in range(i, i + 8):
            for y in range(j, j + 8):
                # 선택된 범위에서 부터 8 * 8 뽑기
                if (x + y) % 2 == 0:
                    # 퐁당퐁당 반복되므로 홀수 짝수마다 바뀌어야함
                    if arr[x][y] != 'W':
                        cnt1 += 1
                    if arr[x][y] != 'B':
                        cnt2 += 1
                else:
                    if arr[x][y] != 'B':
                        cnt1 += 1
                    if arr[x][y] != 'W':
                        cnt2 += 1

        min_cnt = min(min_cnt, cnt1 ,cnt2)

print(min_cnt)