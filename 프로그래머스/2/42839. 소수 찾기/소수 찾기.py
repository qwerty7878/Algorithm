from itertools import permutations

def solution(numbers):
    answer = 0
#     ['1','2','3'] 형태 리스트로 변환
    numbers = list(numbers)
    # print(numbers)
#     후보군 넣기
    isPrimelist = []
#     자릿수에 따른 경우의 수를 위한 자릿수 반복
    for length in range(1, len(numbers) + 1):
#         자릿수에 따른 순열 (중복 x, 순서 o)
        for combi in permutations(numbers, length):
            # print(combi)
            temp = ''
#             문자열 -> 정수 변환 및 저장
            for num in combi:
                temp += num
                tempnum = int(temp)
            
            if tempnum not in isPrimelist:
                isPrimelist.append(tempnum)
    # print(isPrimelist)
#     최종 값 저장 리스트
    result = []
#     소수 판별
    for isPrimeNum in isPrimelist:
        isPrime = True
        if isPrimeNum < 2:
            continue
        for div in range(2, int(isPrimeNum ** 0.5) + 1):
            if isPrimeNum % div == 0:
                isPrime = False
        if isPrime:
            result.append(isPrimeNum)
    # print(result)
    answer = len(result)
    return answer