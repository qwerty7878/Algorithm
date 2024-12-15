# str = input()
# for i in 'abcdefghijklmnopqrstuvwxyz':
#     print(str.find(i), end=" ")

str = input()
for i in 'abcdefghijklmnopqrstuvwxyz':
    if i in str:
        print(str.index(i), end=" ")
    else:
        print(-1, end=" ")