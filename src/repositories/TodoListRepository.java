package repositories;

import entities.TodoList;

public interface TodoListRepository {

  TodoList[] getAll();

  void store(TodoList todoList);

  boolean remove(Integer number);

}
