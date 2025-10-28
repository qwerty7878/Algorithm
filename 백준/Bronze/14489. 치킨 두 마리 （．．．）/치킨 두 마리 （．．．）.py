a,b = map(int,input().split())
chicken = int(input())

sum = a + b
if a + b >= 2 * chicken:
    print(sum - chicken * 2)
else:
    print(sum)