t = int(input())
students = []
for _ in range(t):
    inp = input().split()
    name = inp[0]
    day = int(inp[1])
    month = int(inp[2])
    year = int(inp[3])

    students.append([name,day,month,year])
students_sorted = sorted(students, key = lambda x: (x[3],x[2],x[1]))
print(students_sorted[-1][0])
print(students_sorted[0][0])