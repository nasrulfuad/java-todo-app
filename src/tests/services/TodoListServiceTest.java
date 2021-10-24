package tests.services;

import entities.TodoList;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;

public class TodoListServiceTest {

  public static void main(String[] args) {
    testStore();
  }

  public static void testView() {
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();

    todoListRepository.data[0] = new TodoList("Belajar java dasar");
    todoListRepository.data[1] = new TodoList("Belajar java oop");
    todoListRepository.data[2] = new TodoList("Belajar java standard classes");

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.view();
  }

  public static void testStore() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.store("Belajar java dasar");
    todoListService.store("Belajar java oop");
    todoListService.store("Belajar java standard classes");

    todoListService.view();
  }

}
