def binary_parsing(num, n):
    s = str(bin(num)[2:])
    
    if len(s) != n:
            revs = s[::-1]
            revs += '0' * (n - len(s))
            s = revs[::-1]
    return s
            
def solution(n, arr1, arr2):
    answer = []
    
    for i in range(n):
        s1 = binary_parsing(arr1[i], n)
        s2 = binary_parsing(arr2[i], n)
            
        # print(s1, s2)
        temp = ''        
        for j in range(len(s1)):
            if s1[j] == '1' or s2[j] == '1':
                temp += '#'
            else:
                temp += ' '
        
        answer.append(temp)
    return answer