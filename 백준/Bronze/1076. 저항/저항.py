arr = [input() for _ in range(3)]

ans = ''
for char in arr[:len(arr) - 1]:
    if char == 'black':
        ans += '0'
    elif char == 'brown':
        ans += '1'
    elif char == 'red':
        ans += '2'
    elif char == 'orange':
        ans += '3'
    elif char == 'yellow':
        ans += '4'
    elif char == 'green':
        ans += '5'
    elif char == 'blue':
        ans += '6'
    elif char == 'violet':
        ans += '7'
    elif char == 'grey':
        ans += '8'
    elif char == 'white':
        ans += '9'

ans = int(ans)
last = arr[len(arr) - 1]
if last == 'black':
    ans *= 1
elif last == 'brown':
    ans *= 10
elif last == 'red':
    ans *= 100
elif last == 'orange':
    ans *= 1000
elif last == 'yellow':
    ans *= 10000
elif last == 'green':
    ans *= 100000
elif last == 'blue':
    ans *= 1000000
elif last == 'violet':
    ans *= 10000000
elif last == 'grey':
    ans *= 100000000
elif last == 'white':
    ans *= 1000000000

print(ans)