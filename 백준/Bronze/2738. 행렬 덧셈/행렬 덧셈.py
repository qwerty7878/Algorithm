#   입력
n,m = map(int,input().split())

#   리스트 형태로 한줄에 저장하므로 2차원 배열이지만 1차원 배열을 만들어도 가능함
arrA = []
arrB = []

#   리스트 전체를 한줄에 저장
for i in range(n):
    arrA.append(list(map(int,input().split())))

#   3 3 3 이렇게 한번에 입력되므로
for i in range(n):
    arrB.append(list(map(int,input().split())))

#   n * m 배열 전체 순회
for i in range(n):
    for j in range(m):
        
        #   배열 덧셈
        print(arrA[i][j] + arrB[i][j], end=" ")
    
    #   줄 띄어쓰기
    print()