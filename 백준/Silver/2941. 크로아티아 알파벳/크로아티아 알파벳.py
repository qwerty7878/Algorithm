# 문자열 입력
str = input().strip()
changeStr = str

# 크로아티아 알파벳 변경
if 'c=' in str:
    changeStr = changeStr.replace('c=', '*')

if 'c-' in str:
    changeStr = changeStr.replace('c-', '*')

if 'dz=' in str:
    changeStr = changeStr.replace('dz=', '*')

if 'd-' in str:
    changeStr = changeStr.replace('d-', '*')

if 'lj' in str:
    changeStr = changeStr.replace('lj', '*')

if 'nj' in str:
    changeStr = changeStr.replace('nj', '*')

if 's=' in str:
    changeStr = changeStr.replace('s=', '*')

if 'z=' in str:
    changeStr = changeStr.replace('z=', '*')

# 문자열 개수 출력
print(len(changeStr))