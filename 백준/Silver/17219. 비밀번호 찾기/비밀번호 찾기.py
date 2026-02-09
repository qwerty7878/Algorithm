import sys
input = sys.stdin.readline

n,m = map(int, input().split())

sites = {}
for _ in range(n):
    name, password = input().split()
    sites[name] = password

for _ in range(m):
    site = input().strip()
    print(sites[site])