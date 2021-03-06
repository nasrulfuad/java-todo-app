package services;

import entities.TodoList;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;

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
      var todoList = model[i];
      var no = i + 1;

      if (todoList != null) {
        System.out.println(no + ". " + todoList.getTodo());
      }
    }
  }

  @Override
  public void store(String todo) {
    TodoList todoList = new TodoList(todo);

    todoListRepository.store(todoList);

    System.out.println("BERHASIL menambahkan todo : " + todo);
  }

  @Override
  public void remove(Integer number) {
    boolean success = todoListRepository.remove(number);

    if (success) {
      System.out.println("BERHASIL menghapus todo : " + number);
    } else {
      System.out.println("GAGAL menghapus todo : " + number);
    }
  }
}
