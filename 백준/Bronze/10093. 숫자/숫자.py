a,b = map(int,input().split())

number_array = []
start = min(a,b)
end = max(a,b)
for number in range(start + 1, end):
    number_array.append(number)
print(len(number_array))
print(' '.join(map(str,number_array)))