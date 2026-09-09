def solution(n, words):
    answer = []

    before = words[0]
    temp = [before]

    for idx in range(1, len(words)):
        if words[idx].startswith(before[-1]) and words[idx] not in temp:
            temp.append(words[idx])
            before = words[idx]
        else:
            return [(idx % n) + 1, (idx // n) + 1]
            
    if len(temp) == len(words):
        return [0, 0]