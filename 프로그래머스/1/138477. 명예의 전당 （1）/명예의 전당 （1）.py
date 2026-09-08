# 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다. k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면, 출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다.
# 이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다.

def solution(k, score):
    answer = []
    
    temp = []
    for num in score:
        if len(temp) < k:
            temp.append(num)
        else:
            if num > min(temp):
                temp.remove(min(temp))
                temp.append(num)
        answer.append(min(temp))
        # print(answer)
    return answer