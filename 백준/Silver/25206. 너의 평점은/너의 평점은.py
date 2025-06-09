sum = 0
denominator = 0
for i in range(20):
    name,score,grade = map(str,input().split())
    score = float(score)

    if grade == 'A+':
        sum += (score * 4.5)
        denominator += score
    elif grade == 'A0':
        sum += (score * 4.0)
        denominator += score
    elif grade == 'B+':
        sum += (score * 3.5)
        denominator += score
    elif grade == 'B0':
        sum += (score * 3.0)
        denominator += score
    elif grade == 'C+':
        sum += (score * 2.5)
        denominator += score
    elif grade == 'C0':
        sum += (score * 2.0)
        denominator += score
    elif grade == 'D+':
        sum += (score * 1.5)
        denominator += score
    elif grade == 'D0':
        sum += (score * 1.0)
        denominator += score
    elif grade == 'P':
        continue
    elif grade == 'F':
        sum += (score * 0.0)
        denominator += score

print(f'{sum / denominator:.6f}')