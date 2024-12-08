import sys

num = int(sys.stdin.readline())

for i in range(num):
    a,b = map(int, sys.stdin.readline().split())
    text = "Case #"
    print(text,i + 1,": ",a," + ",b," = ",a+b,sep="")