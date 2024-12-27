grade_dict = {
    'A+' : 4.5,
    'A0': 4.0,
    'B+': 3.5,
    'B0': 3.0,
    'C+': 2.5,
    'C0': 2.0,
    'D+': 1.5,
    'D0': 1.0,
    'F': 0.0
}

major_score = 0
total_score = 0

for i in range(20):
    n,s,g = input().split()
    if g == 'P':
        continue
    major_score += float(s) * grade_dict[g]
    total_score +=  float(s)

print('%.6f' % (major_score / total_score))