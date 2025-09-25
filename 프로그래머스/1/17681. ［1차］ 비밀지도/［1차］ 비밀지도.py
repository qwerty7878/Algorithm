def solution(n, arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        
        a = str(bin(arr1[i])[2:])
        b = str(bin(arr2[i])[2:])
        
        if len(a) < len(arr1):
            a = ((len(arr1) - len(a)) * '0') + a
        if len(b) < len(arr1):
            b = ((len(arr1) - len(b)) * '0') + b
            
        temp = ''
        for i in range(len(a)):
            if a[i] == '1' or b[i] == '1':
                temp += '#'
            elif a[i] == '1' and b[i] == '1':
                temp += '#'
            elif a[i] == '0' and b[i] == '0':
                temp += ' '
        answer.append(temp)
    return answer