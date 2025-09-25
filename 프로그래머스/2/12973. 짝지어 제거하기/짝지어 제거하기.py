def solution(s):
    answer = 1
    st = []
    
    for i in s:
        if st and st[-1] != i:
            st.append(i)
        elif st and st[-1] == i:
            st.pop()
        else:
            st.append(i)
    if st:
        answer = 0
    return answer