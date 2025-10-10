t = int(input())
for _ in range(t):
    n = int(input())
    rev_n = int(str(n)[::-1])
    # print(rev_n)
    test_num = rev_n + n
    if str(test_num) == str(test_num)[::-1]:
        print('YES')
    else:
        print('NO')