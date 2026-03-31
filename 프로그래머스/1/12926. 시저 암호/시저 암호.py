def solution(s, n):
    answer = ''
    
    for char in s:
        if char == ' ':
            answer += ' '
        else:
            if char.islower():
                answer += chr(((ord(char) + n - ord('a')) % 26) + ord('a'))
            else:
                answer += chr(((ord(char) + n - ord('A')) % 26) + ord('A'))
    return answer