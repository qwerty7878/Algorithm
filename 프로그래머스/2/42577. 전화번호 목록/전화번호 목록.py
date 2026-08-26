def solution(phone_book):
    sort_phone_book = sorted(phone_book)
    for idx in range(1, len(phone_book)):
        if sort_phone_book[idx].startswith(sort_phone_book[idx - 1]):
            return False
    return True