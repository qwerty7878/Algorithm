n = int(input())

for i in range(n):
    alpha = input()
    if alpha.isupper():
        print(f'#{i + 1} {alpha} 는 대문자 입니다.')
    elif alpha.islower():
        print(f'#{i + 1} {alpha} 는 소문자 입니다.')