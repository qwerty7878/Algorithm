def solution(elements):
    answer = 0
    set_arr = set()
    copy = elements * 2
    # print(copy)

    for leng in range(1, len(elements) + 1):
        # print(leng)
        for i in range(len(elements)):
            arr = copy[i: (i + leng)]
            if len(arr) == leng:
                # print(arr)
                set_arr.add(sum(arr))
    # print(set_arr)
    answer = len(set_arr)
    return answer