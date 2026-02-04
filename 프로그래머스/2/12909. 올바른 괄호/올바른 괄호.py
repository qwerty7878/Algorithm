def solution(s):
    answer = True
    temp = []
    
    for char in s:
# 첫번째 문자
        if not temp:
#         ) 라면 바로 잘못된 형식임
            if char == ')':
                return False
#         첫번째 값 임시 저장
            temp.append(char)
#     두번째 부터 형식 비교
        elif temp[-1] == '(' :
#     () 형태면 없애기
            if char == ')':
                temp.pop()
#             ( ( 라면 더하기
            else:
                temp.append(char)
#     빈 상태가 아니라면
    if temp:
        return False
    else:
        return True