t = int(input())
paper = [[0] * 100 for _ in range(100)]

for _ in range(t):
    a,b = map(int, input().split())
    # 중복검열
    for i in range(a, a + 10):
        for j in range(b, b + 10):
            paper[i][j] = 1
    # 1로 된 부분 더하기
    area = sum(sum(row) for row in paper)
print(area)