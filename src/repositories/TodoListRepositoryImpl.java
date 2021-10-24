package repositories;

import entities.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public void remove(Integer number) {

    }
}
