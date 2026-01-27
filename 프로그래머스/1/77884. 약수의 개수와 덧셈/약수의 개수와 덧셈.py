def solution(left, right):
    answer = 0
    for num in range(left, right + 1):
        count = 0
        for div in range(1, num + 1):
            if num % div == 0:
                count += 1
        if count % 2 == 0:
            answer += num
        else:
            answer -= num
    return answer