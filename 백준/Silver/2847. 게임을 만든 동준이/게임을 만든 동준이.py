t = int(input())
points = []

for _ in range(t):
    point = int(input())
    points.append(point)

points_rev = points[::-1]
# print(points_rev)

maxpoint = points[-1]
count = 0
for idx in range(1, t):
    # print(points_rev[idx])
    if points_rev[idx] >= maxpoint:
        while True:
            points_rev[idx] -= 1
            count += 1

            if points_rev[idx] <= maxpoint - 1:
                break
        maxpoint = points_rev[idx]
    else:
        maxpoint = points_rev[idx]
        continue
print(count)