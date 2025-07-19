t = int(input())
arr = []
for i in range(t):
    arr.append(int(input()))

if arr.count(0) > arr.count(1):
    print('Junhee is not cute!')
elif arr.count(1) > arr.count(0):
    print('Junhee is cute!')