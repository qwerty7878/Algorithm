import sys

t = int(sys.stdin.readline())
for _ in range(t):
    str_arr = list(sys.stdin.readline().rstrip().split(' '))
    for word in range(len(str_arr)):
        str_arr[word] = str_arr[word][::-1]
        # print(str_arr[word])
    print(' '.join(str_arr))