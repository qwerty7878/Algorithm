l, p = map(int, input().split())
article = list(map(int, input().split()))

for participant in article:
    real_participant = l * p
    print(participant - real_participant, end=' ')