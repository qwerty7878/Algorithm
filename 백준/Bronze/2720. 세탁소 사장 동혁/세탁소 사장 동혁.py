t = int(input())
for i in range(t):
    c = int(input())
    q,d,n,p = 0,0,0,0
    
    while c > 0:
        q = c // 25
        d = (c % 25) // 10
        n = ((c % 25) % 10) // 5
        p = (c % 25 % 10 % 5) // 1
        break
        
    print(q,d,n,p)