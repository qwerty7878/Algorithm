def solution(name, yearning, photo):
    answer = []

    for li in photo:
        total = 0
        for i in range(len(li)):
            for j in range(len(name)):
                if li[i] == name[j]:
                    total += yearning[j]
        answer.append(total)
    return answer