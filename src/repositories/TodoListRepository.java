package repositories;

import entities.TodoList;

public interface TodoListRepository {

  TodoList[] getAll();

  void store(TodoList todoList);

  void remove(Integer number);

}
