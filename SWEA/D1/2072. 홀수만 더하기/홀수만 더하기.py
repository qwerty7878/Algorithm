t = int(input())

for idx in range(t):
    sum = 0
    numlist = list(map(int, input().split()))
    for num in numlist:
       	if num % 2 != 0:
            sum += num
    print(f"#{idx + 1} {sum}")