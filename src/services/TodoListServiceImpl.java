package services;

import entities.TodoList;
import repositories.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void view() {
        TodoList[] model = todoListRepository.getAll();

        System.out.println("Todo List :");

        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    @Override
    public void store(String todo) {

    }

    @Override
    public void remove(Integer number) {

    }
}
