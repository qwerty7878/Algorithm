a = int(input())
b = int(input())
c = int(input())
total = a * b * c

arr = [0] * 10

for char in str(total):
    for idx in range(10):
        if char == str(idx):
            arr[idx] += 1
            break

print('\n'.join(map(str, arr)))