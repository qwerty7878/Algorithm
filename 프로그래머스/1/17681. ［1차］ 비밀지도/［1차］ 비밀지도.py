def parsing(num, n):
    binary_num = str(bin(num))[2:]
    
    diff = n - len(binary_num)
    if diff != 0:
        return '0' * diff + binary_num
    else:
        return binary_num

def solution(n, arr1, arr2):
    answer = []
    
    for a,b in zip(arr1, arr2):
        s = ''
        bi_a = parsing(a, n)
        bi_b = parsing(b, n)

        for idx in range(len(bi_a)):
            if bi_a[idx] == '0':
                if bi_b[idx] == '1':
                    s += '#'
                else:
                    s += ' '
            else:
                s += '#'    
            # print(s)
        answer.append(s)
    return answer