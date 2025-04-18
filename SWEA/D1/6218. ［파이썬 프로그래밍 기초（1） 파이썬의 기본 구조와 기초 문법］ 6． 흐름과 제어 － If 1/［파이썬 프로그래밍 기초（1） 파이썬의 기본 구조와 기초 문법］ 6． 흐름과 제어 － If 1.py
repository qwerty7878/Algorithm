t = int(input())

for i in range(1, t + 1):
    if t % i == 0:
        print(f'{i}(은)는 {t}의 약수입니다.')
