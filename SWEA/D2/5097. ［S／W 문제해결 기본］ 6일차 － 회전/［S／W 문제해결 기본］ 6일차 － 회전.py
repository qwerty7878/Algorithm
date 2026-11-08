t = int(input())

for test in range(1, t + 1):
    n, m = map(int, input().split())
    arr = list(map(int, input().split()))
    number = arr[m % n]
    print(f"#{test} {number}")