import sys

s = sys.stdin.readline().strip()
answer = 0
answer += s.count('a')
answer += s.count('e')
answer += s.count('i')
answer += s.count('o')
answer += s.count('u')
print(answer)