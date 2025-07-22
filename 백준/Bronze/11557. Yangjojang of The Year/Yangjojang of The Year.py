t = int(input())
dict = {}
for i in range(t):
    n = int(input())
    for j in range(n):
        s,l = input().split()
        l = int(l)
        dict[s] = l
    print(max(dict,key=dict.get))