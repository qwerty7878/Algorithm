n = input()
num_list = []

for num in n:
    num_list.append(num)
num_list.sort(reverse=True)

if '0' not in num_list:
    print(-1)
else:
    if sum(map(int, num_list)) % 3 != 0:
        print(-1)
    else:
        print(''.join(num_list))