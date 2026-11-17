def solution(s, n):
    answer = ''
    
    for c in s:
        if c == ' ':
            answer += ' '
        elif c.isupper():
            answer += chr((ord(c) + n - ord('A')) % 26 + ord('A'))
        else:
            answer += chr((ord(c) + n - ord('a')) % 26 + ord('a'))
    return answer