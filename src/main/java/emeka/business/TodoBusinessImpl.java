package emeka.business;

import emeka.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {

    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        for(String todo:todos){
            if(todo.contains("Spring")) filteredTodos.add(todo);
        }
        return filteredTodos;
    }

    public List<String> retrieveTodosRelatedToSpring2(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos2(user);
        for(String todo:todos){
            if(todo.contains("Spring")) filteredTodos.add(todo);
        }
        return filteredTodos;
    }
}

