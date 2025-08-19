import sys

n = int(sys.stdin.readline())
person = list(map(int, sys.stdin.readline().split()))
time = []
wait = 0

person.sort()
for i in person:
    wait += i
    time.append(wait)
print(sum(time))