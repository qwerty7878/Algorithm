# 점수 합 초기값
totalsum = 0
scoresum = 0

#   20개 반복
for i in range(20):

    #   과목명, 학점, 등급
    name,score,grade = input().split()

    #   학점은 숫자로
    score = float(score)

    #   전공평점은 전공과목별 (학점 × 과목평점)의 합
    if grade == 'A+':
        totalsum += (score * 4.5)
    if grade == 'A0':
        totalsum += (score * 4.0)
    if grade == 'B+':
        totalsum += (score * 3.5)
    if grade == 'B0':
        totalsum += (score * 3.0)
    if grade == 'C+':
        totalsum += (score * 2.5)
    if grade == 'C0':
        totalsum += (score * 2.0)
    if grade == 'D+':
        totalsum += (score * 1.5)
    if grade == 'D0':
        totalsum += (score * 1.0)
    if grade == 'F':
        totalsum += (score * 0.0)
    if grade == 'P':
        pass

    #   p는 계산에서 제외
    if grade == 'P':
        continue

    #   학점의 총합
    scoresum += score

#   6자리까지 출력
print(f'{totalsum / scoresum:0.6f}')