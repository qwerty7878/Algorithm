n, k = map(int, input().split())
grade_room_w = [0] * 6
grade_room_m = [0] * 6

for _ in range(n):
    sex, grade = map(int, input().split())
    if sex == 0:
        grade_room_w[grade - 1] += 1
    else:
        grade_room_m[grade - 1] += 1

def count_room(grade_room):
    room_count = 0
    for student in grade_room:
        if student % k == 0:
            room_count += (student // k)
        else:
            room_count += (student // k) + 1
    return room_count

print(count_room(grade_room_m) + count_room(grade_room_w))