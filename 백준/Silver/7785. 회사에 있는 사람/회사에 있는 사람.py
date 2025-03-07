n = int(input())
company = set()

for i in range(n):
    name,iscome = input().split()
    if iscome == 'enter':
        company.add(name)
    else:
        company.remove(name)

for i in sorted(company, reverse=True):
    print(i)