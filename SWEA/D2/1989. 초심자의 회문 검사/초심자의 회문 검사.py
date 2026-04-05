t = int(input())

for test in range(t):
    ans = 0
    s = input()
    rev = s[::-1]
    if s == rev:
        ans = 1
    print(f"#{test + 1} {ans}")