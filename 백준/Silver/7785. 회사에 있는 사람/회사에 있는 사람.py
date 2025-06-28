import sys

n = int(sys.stdin.readline())
company = {}

for i in range(n):
    name,isEnter = sys.stdin.readline().split()
    company[name] = isEnter

for name in sorted(company.keys(), reverse=True):
    if company[name] == 'enter':
        print(name)