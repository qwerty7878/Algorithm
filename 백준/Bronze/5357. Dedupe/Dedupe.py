t = int(input())
for _ in range(t):

    word = input()
    q = []

    for char in word:
        if q and q[-1] == char:
            continue
        else:
            q.append(char)

    print("".join(q))