def solution(keyinput, board):
    
    max_x = board[0] // 2
    max_y = board[1] // 2
    x, y = 0, 0
    for key in keyinput:
        if key == 'left' and -max_x < x:
            x -= 1
        elif key == 'right' and max_x > x:
            x += 1
        elif key == 'up' and max_y > y:
            y += 1
        elif key == 'down' and -max_y < y:
            y -= 1
    
    return [x, y]