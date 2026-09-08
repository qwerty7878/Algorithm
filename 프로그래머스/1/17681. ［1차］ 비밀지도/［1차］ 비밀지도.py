def solution(n, arr1, arr2):
    answer = []
    
    for idx in range(n):
        binum1 = str(bin(arr1[idx])[2:])
        binum2 = str(bin(arr2[idx])[2:])
        
        if len(binum1) != n:
            binum1 = '0' * (n - len(binum1)) + binum1
        if len(binum2) != n:
            binum2 = '0' * (n - len(binum2)) + binum2
        
        target = ''
        for j in range(n):
            if binum1[j] == '1' or binum2[j] == '1':
                target += '#'
            else:
                target += ' '
        answer.append(target)
    return answer