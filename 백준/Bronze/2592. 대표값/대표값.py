from collections import Counter

num_list = []
for _ in range(10):
    num = int(input())
    num_list.append(num)

def pringAverage(num_list):
    return sum(num_list) // len(num_list)

def mostCountNum(num_list):
    count = Counter(num_list)
    return count.most_common(1)[0][0]

print(pringAverage(num_list))
print(mostCountNum(num_list))