n,k = map(int, input().split())
arr = []

if k == 1:
    print(2)
else:
    for i in range(2, n + 1):
        isPrime = True
        # 소수판정하기
        for j in range(2, i):
            if i % j == 0:
                isPrime = False
                break
            elif i % j != 0 and j + 1 == i:
                isPrime = True

        if isPrime:
            idx = 1
            while True:
                if n >= (i * idx):
                    if i * idx not in arr:
                        arr.append(i * idx)
                        idx += 1
                        if len(arr) == k:
                            print(arr[-1])
                            break
                    else:
                        idx += 1
                elif len(arr) == k:
                    print(arr[-1])
                    break
                else:
                    break