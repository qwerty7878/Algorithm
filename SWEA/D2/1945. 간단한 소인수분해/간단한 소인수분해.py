# import sys
# sys.stdin = open("input.txt", "r")

T = int(input())
div = [2, 3, 5, 7, 11]

# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    # ///////////////////////////////////////////////////////////////////////////////////
    num = int(input())
    answer = [0] * 5
    idx = 0

    while idx < len(div):
        if num % div[idx] == 0:
            num //= div[idx]
            answer[idx] += 1
        else:
            idx += 1

    print(f"#{test_case}", *answer)
# ///////////////////////////////////////////////////////////////////////////////////