def solution(phone_book):
    answer = True
    
    phone_book.sort()
    for idx in range(1, len(phone_book)):
        target = phone_book[idx - 1]
        phone_num = phone_book[idx]
        if phone_num[:len(target)] == target:
            answer = False
            break
    return answer