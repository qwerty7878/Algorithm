angle1,angle2,angle3 = map(int,input().split())
arr = [angle1, angle2, angle3]
arr.sort()

if arr[2] >= arr[0] + arr[1]:
    arr[2] = arr[0] + arr[1] -1

print(sum(arr))