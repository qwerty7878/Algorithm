while True:
    s = input().lower()
    if s == '#':
        break

    cnt = 0
    for i in s:
        if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
            cnt += 1
    print(cnt)