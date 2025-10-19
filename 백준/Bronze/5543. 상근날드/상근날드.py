burgers = []
for i in range(3):
    burgers.append(int(input()))
burgers.sort()
drinks = []
for i in range(2):
    drinks.append(int(input()))
drinks.sort()

print(burgers[0] + drinks[0] - 50)