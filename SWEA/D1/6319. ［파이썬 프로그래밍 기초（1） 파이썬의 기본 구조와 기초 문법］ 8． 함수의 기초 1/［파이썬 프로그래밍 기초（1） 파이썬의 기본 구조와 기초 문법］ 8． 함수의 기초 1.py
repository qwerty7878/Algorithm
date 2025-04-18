str = input()
if str[::-1] == str[::1]:
    print(str)
    print('입력하신 단어는 회문(Palindrome)입니다.')