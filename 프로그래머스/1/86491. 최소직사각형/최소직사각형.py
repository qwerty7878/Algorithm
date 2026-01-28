def solution(sizes):
    answer = 0
    maxXSize = 0
    maxYSize = 0
    for card in sizes:
        xSize = max(card[0], card[1])
        ySize = min(card[0], card[1])
        # print(xSize, ySize)
        
        if xSize > maxXSize:
            maxXSize = xSize
        if ySize > maxYSize:
            maxYSize = ySize
        
    # print(maxXSize, maxYSize)
    answer = maxXSize * maxYSize
    return answer