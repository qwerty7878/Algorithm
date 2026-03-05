a,b = input().split()

sum = 0
for i in a:
    for j in b:
        a_num = int(i)
        b_num = int(j)
        sum += a_num * b_num
print(sum)