n = input()
room_number = [0] * 10

for num in n:
    number = int(num)
    room_number[number] += 1

room_number[6] = room_number[9] = (room_number[6] + room_number[9] + 1) // 2
max_set_count = max(room_number)
print(max_set_count)