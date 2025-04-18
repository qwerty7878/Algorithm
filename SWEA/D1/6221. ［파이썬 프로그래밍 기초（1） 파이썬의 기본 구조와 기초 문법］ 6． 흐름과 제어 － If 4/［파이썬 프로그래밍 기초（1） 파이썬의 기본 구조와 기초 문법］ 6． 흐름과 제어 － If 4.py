a = input()
b = input()

if a == '가위' and b == '바위':
    print('Result : Man2 Win!')
if a == '가위' and b == '가위':
    print('Result : Draw')
if a == '가위' and b == '보':
    print('Result : Man1 Win!')

if a == '바위' and b == '바위':
    print('Result : Draw')
if a == '바위' and b == '가위':
    print('Result : Man1 Win!')
if a == '바위' and b == '보':
    print('Result : Man2 Win!')

if a == '보' and b == '바위':
    print('Result : Man1 Win!')
if a == '보' and b == '가위':
    print('Result : Man2 Win!')
if a == '보' and b == '보':
    print('Result : Draw')