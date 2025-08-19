import sys

n,m = map(int,sys.stdin.readline().split())
dic = {}

for i in range(n):
    site,pw = sys.stdin.readline().split()
    dic[site] = pw

for i in range(m):
    searchsite = sys.stdin.readline().rstrip()
    print(dic[searchsite])