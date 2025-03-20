from collections import deque

def solution(arr):
    st = deque()
    st.append(arr[0])
    for i in range(1,len(arr)):
        if st[-1] != arr[i]:
            st.append(arr[i])
        
    answer = []
    for i in st:
        answer.append(i)
    return answer