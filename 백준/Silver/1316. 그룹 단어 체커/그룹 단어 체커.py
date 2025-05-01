# 단어 개수
n = int(input())

# 개수 저장
count = n

# 단어 개수 반복
for i in range(n):

    # 단어 입력
    word = input()

    # 단어 하나하나 확인하기
    for j in range(0, len(word) - 1):
        # 바로 그 다음에 나오는 경우   ex) happy
        if word[j] == word[j + 1]:
            continue

        # 바로 그 다음 경우를 제외하고 이후에 나오는 경우
        elif word[j] in word[j + 1:]:

            # 더이상 볼 가치도 없음
            count -= 1
            break
# 출력
print(count)