total = int(input())
num = int(input())
sum = 0

for i in range(num):
    price,item = map(int, input().split())
    sum += price * item

if(sum == total):
    print("Yes")
else:
    print("No")