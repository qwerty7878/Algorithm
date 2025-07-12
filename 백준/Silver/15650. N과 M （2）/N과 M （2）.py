import sys

def backtracking(start):
      if len(arr) == m:
            print(' '.join(map(str, arr)))
            return

      for i in range(start, n + 1):
            if i not in arr:
                  arr.append(i)
                  backtracking(i)
                  arr.pop()

n,m = map(int, sys.stdin.readline().split())
arr = []
backtracking(1)