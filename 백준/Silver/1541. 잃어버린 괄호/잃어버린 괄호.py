import sys

str = sys.stdin.readline().strip()
str_l = list(str.split('-'))

answer = sum(map(int, str_l[0].split('+')))

for i in str_l[1:]:
    answer -= sum(map(int, i.split('+')))

print(answer)