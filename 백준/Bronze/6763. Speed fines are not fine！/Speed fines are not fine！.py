limit = int(input())
carSpeed = int(input())

speed = carSpeed - limit
penalty = 0

if speed >= 31:
    penalty = 500
elif 21 <= speed <= 30:
    penalty = 270
elif 1 <= speed <= 20:
    penalty = 100

if penalty > 0:
    print(f"You are speeding and your fine is ${penalty}.")
else:
    print("Congratulations, you are within the speed limit!")