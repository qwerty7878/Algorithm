def solution(score):
    answer = []
    
    total = []
    for array in score:
        total.append(array[0] + array[1])
    sorted_array = sorted(total, reverse=True)
    
    for num in total:
        answer.append(sorted_array.index(num) + 1)
                
    # print(answer)
    return answer