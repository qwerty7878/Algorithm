t = int(input())
name = []

for _ in range(t):
    name.append(input())

sort_dec = sorted(name,reverse=True)
sort_inc = sorted(name)

if name == sort_dec:
    print("DECREASING")
elif name == sort_inc:
    print("INCREASING")
else:
    print("NEITHER")