def solution(s):
    s = s.upper()
    print(s.upper())
    if s.count('P') == s.count('Y'):
        return True
    else:
        return False