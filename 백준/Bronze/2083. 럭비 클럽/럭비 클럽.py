while True:
    str = input()
    if str == '# 0 0':
        break
    else:
        arr = str.split(' ')
        if int(arr[1]) > 17 or int(arr[2]) >= 80:
            print(f"{arr[0]} Senior")
        else:
            print(f"{arr[0]} Junior")