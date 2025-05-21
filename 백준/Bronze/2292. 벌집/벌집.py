n = int(input())

cnt,room,index = 1,1,1
while n > room:
    room += 6 * index
    cnt += 1
    index += 1
print(cnt)