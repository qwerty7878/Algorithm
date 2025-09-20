def solution(s):
    answer = True
    st = []
    
    for i in s:
        if len(st) == 0:
            st.append(i)
        else:
            if st[-1] == '(' and i == ')':
                st.pop()
            else:
                st.append(i)
    if len(st) != 0:
        answer = False
    return answer