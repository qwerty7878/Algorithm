t = int(input())
candidates = []

for _ in range(t):
    candidate = int(input())
    candidates.append(candidate)

count = 0
while True:
    if all(candidates[0] > candidates[idx] for idx in range(1, t)):
        break
    else:
        maxvotes = max(candidates)
        if maxvotes != candidates[0]:
            candidates[candidates.index(maxvotes)] -= 1
            candidates[0] += 1
            count += 1
            maxvotes = max(candidates)
        if maxvotes == candidates[0] and candidates.count(maxvotes) != 1:
            candidates[0] += 1
            count += 1
print(count)