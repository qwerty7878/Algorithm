def solution(s):
    answer = True
    if len(s) == 4 or len(s) == 6:
        for i in s:
            if i.isdigit():
                continue
            else:
                return False
                break
        return True
    else:   
        return False