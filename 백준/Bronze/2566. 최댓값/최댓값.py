#   배열 초기 선언
arr = []

#   9개 반복 리스트 전체를 한줄에 저장
for i in range(9):
    arr.append(list(map(int,input().split())))

#   최대값 선언
max = arr[0][0]

#   초기 행 렬 초기 선언
row = 1
col = 1

#   최대값 찾기
for i in range(9):
    for j in range(9):

        #   더 크면 최대값 변경
        if max < arr[i][j]:
            max = arr[i][j]

            #   인덱스는 0 부터 시작하니까
            row = i + 1
            col = j + 1

print(max)
print(row,col)