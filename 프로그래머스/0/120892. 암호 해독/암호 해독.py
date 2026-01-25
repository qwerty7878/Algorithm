def solution(cipher, code):
    answer = ''
    for idx in range(code, len(cipher) + 1, code):
        answer += cipher[idx - 1]
    return answer