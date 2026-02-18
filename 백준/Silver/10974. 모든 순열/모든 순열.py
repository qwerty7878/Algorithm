from itertools import permutations

n = int(input())
arr = [num for num in range(1, n + 1)]

ans = []
for i in permutations(arr, n):
    ans.append(' '.join(map(str, i)))

print('\n'.join(ans))