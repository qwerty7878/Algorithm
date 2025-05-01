# 대소문자 구분 x
str = input().upper().strip()

# 단어 중복 검열 M I S P / Z A
list = list(set(str))

# 개수 저장 배열
cnt = []

# 각 개수 확인용 반복
for i in list:
    # 문자열에서의 개수 확인
    count = str.count(i)
    # 개수 저장
    cnt.append(count)

# 만약 가장 많이 사용된 알파벳이 여러개라면
if cnt.count(max(cnt)) >= 2:
    print('?')
else:
# 가장 많이 사용 되는 값
    print(list[cnt.index(max(cnt))])