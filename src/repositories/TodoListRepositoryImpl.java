package repositories;

import entities.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    private TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return new TodoList[0];
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public void remove(Integer number) {

    }
}
