n = int(input())
numbers = list(map(int, input().split()))
numbers = sorted(set(numbers))
print(*numbers)