import sys

n = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))
ans = [-1] * n
# 인덱스 저장
st = []

for i in range(n):
    while st and numbers[st[-1]] < numbers[i]:
        index = st.pop()
        ans[index] = numbers[i]
    st.append(i)

print(*ans)