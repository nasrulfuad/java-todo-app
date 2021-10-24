package repositories;

import entities.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    void remove(Integer number);

}
