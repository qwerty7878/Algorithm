import sys

def backtracking():
      if len(arr) == m:
            print(' '.join(map(str, arr)))
            return

      for i in range(1, n + 1):
            if i in arr:
                  continue
            arr.append(i)
            backtracking()
            arr.pop()

n,m = map(int,sys.stdin.readline().split())
arr = []
backtracking()