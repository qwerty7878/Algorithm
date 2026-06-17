def solution(num_list):
    odd = []
    even = []
    for num in num_list:
        if num % 2 == 0:
            even.append(num)
        else:
            odd.append(num)
    hap = int(''.join(map(str, even))) + int(''.join(map(str, odd)))
    return hap