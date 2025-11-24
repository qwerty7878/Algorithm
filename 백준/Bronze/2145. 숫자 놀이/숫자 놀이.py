def digit_sum(num):
    while num >= 10:
        num_sum = 0
        for char in str(num):
            num_sum += int(char)
        num = num_sum
    return num

while True:
    num = int(input())
    if num == 0:
        break
    result = digit_sum(num)
    print(result)