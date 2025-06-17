t = int(input())

for i in range(t):
    c = int(input())

    quarter, dime, nickel, penny = 0, 0, 0, 0

    while True:
        quarter = c // 25
        dime = (c % 25) // 10
        nickel = ((c % 25) % 10) // 5
        penny = ((c % 25) % 10) % 5
        break

    print(quarter, dime, nickel, penny)