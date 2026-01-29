def solution(name, yearning, photo):
    answer = []
    for friends in photo:
        total = 0
        for friend in friends:
            if friend in name:
                total += yearning[name.index(friend)]
        answer.append(total)
    return answer