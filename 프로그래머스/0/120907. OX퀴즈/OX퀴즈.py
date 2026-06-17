def solution(quiz):
    answer = []
    
    for que in quiz:
        array = que.split(' ')
        num1 = int(array[0])
        num2 = int(array[2])
        result = int(array[4])
        
        if array[1] == '-':
            if result == (num1 - num2):
                answer.append('O')
            else:
                answer.append('X')
        else:
            if result == (num1 + num2):
                answer.append('O')
            else:
                answer.append('X')
    return answer