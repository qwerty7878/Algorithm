n,newScore,p = map(int,input().split())

if n == 0:
    print(1)
else:
    ranking_list = list(map(int,input().split()))

    ranking_list.append(newScore)
    ranking_list.sort(reverse=True)

    if p == n and ranking_list[-1] >= newScore:
        print(-1)
    else:
        print(ranking_list.index(newScore) + 1)