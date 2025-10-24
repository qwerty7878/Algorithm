t = int(input())

total_grade = 0
total_score = 0
for _ in range(t):
    name, grade, rating = input().split()
    grade = int(grade)
    total_grade += grade

    if rating == 'A+':
        total_score += grade * 4.3
    elif rating == 'A0':
        total_score += grade * 4.0
    elif rating == 'A-':
        total_score += grade * 3.7
    elif rating == 'B+':
        total_score += grade * 3.3
    elif rating == 'B0':
        total_score += grade * 3.0
    elif rating == 'B-':
        total_score += grade * 2.7
    elif rating == 'C+':
        total_score += grade * 2.3
    elif rating == 'C0':
        total_score += grade * 2.0
    elif rating == 'C-':
        total_score += grade * 1.7
    elif rating == 'D+':
        total_score += grade * 1.3
    elif rating == 'D0':
        total_score += grade * 1.0
    elif rating == 'D-':
        total_score += grade * 0.7
    elif rating == 'F':
        total_score += grade * 0.0

print(f'{total_score / total_grade + 10 ** -10:.2f}')