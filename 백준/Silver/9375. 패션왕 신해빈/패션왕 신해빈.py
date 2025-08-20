import sys

t = int(sys.stdin.readline())

for _ in range(t):
    fashion = {}
    n = int(sys.stdin.readline())
    for _ in range(n):
        name,type = sys.stdin.readline().split()
        # 해당 종류를 이미 가지고 있다면
        if type in fashion:
            # 추가해줌
            fashion[type].append(name)
        else:
            fashion[type] = [name]
    # 경우의 수를 구할때 곱을 사용하므로 0이 들어가면 안됨
    cnt = 1
    for i in fashion:
        # 해당 타입의 옷을 안 입은 것도 포함시켜야함
        cnt *= (len(fashion[i]) + 1)
    # 알몸인 경우를 제외함
    print(cnt - 1)