def solution(todo_list, finished):
    answer = []
    for i in range(0, len(finished)):
        if finished[i] == False:
            answer.append(todo_list[i])
    return answer