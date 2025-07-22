t = int(input())
for _ in range(t):
    y_score, K_score = 0, 0
    for j in range(9):
        a, b = map(int,input().split())
        y_score += a
        K_score += b

    if y_score > K_score:
        print('Yonsei')
    elif y_score < K_score:
        print('Korea')
    else:
        print('Draw')
