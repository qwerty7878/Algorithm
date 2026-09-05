def solution(s, n):
    answer = ''

    for char in s:
        if char == ' ':
            answer += ' '
        elif 'a' <= char <= 'z':
            answer += chr((ord(char) + n - ord('a')) % 26 + ord('a'))
        elif 'A' <= char <= 'Z':
            answer += chr((ord(char) + n - ord('A')) % 26 + ord('A'))
    return answer