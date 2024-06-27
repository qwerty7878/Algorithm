import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        ArrayList<String> todo = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++){
            todo.add(todo_list[i]);
        }
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == true){
                todo.remove(todo_list[i]);
            }
        }
        
        String[] answer = new String [todo.size()];
        for(int i = 0; i < todo.size(); i++){
            answer[i] = todo.get(i);
        }
        return answer;
    }
}