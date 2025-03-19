def solution(s):
    s = s.lower()
    pcnt = s.count('p')
    ycnt = s.count('y')
    
    if pcnt == ycnt or (pcnt == 0 and ycnt == 0):
        return True
    else:
        return False