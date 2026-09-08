def solution(elements):
    d_elements = elements * 2
    
    arr = []
    for i in range(1, len(elements) + 1):
        for j in range(len(elements)):
            temp = sum(d_elements[j:j + i])
            arr.append(temp)
    return len(set(arr))