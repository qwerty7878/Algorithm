t = int(input())
for test in range(1, t + 1):
    n = set(input())
    m = input()
    
    maxcnt = 0
    for c in n:
        if m.count(c) > maxcnt:
            maxcnt = m.count(c)
    
    print(f"#{test} {maxcnt}")