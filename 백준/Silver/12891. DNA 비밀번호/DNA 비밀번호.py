import sys
from tabnanny import check

s, p = map(int, sys.stdin.readline().strip().split())
dna = sys.stdin.readline().strip()
a,c,g,t = map(int, sys.stdin.readline().strip().split())

cnt = 0
current = {'A':0, 'C':0, 'G':0, 'T':0}

for i in range(p):
    current[dna[i]] += 1

def check():
    return current['A'] >= a and current['C'] >= c and current['G'] >= g and current['T'] >= t

# 초기값 확인
if check():
    cnt += 1

# 슬라이딩 윈도우 도입
for i in range(p, s):
    current[dna[i - p]] -= 1
    current[dna[i]] += 1

    # 윈도우 검사
    if check():
        cnt += 1

print(cnt)