def solution(numbers):
    answer = ''
    sorted_numbers = sorted(map(str, numbers), key = lambda x : x * 3, reverse = True)
    # print(sorted_numbers)
    answer = ''.join(sorted_numbers)
    if sorted_numbers[0] == '0':
        return '0'
    return answer