package tests.views;

import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;
import views.TodoListView;

public class TodoListViewTest {

  public static void main(String[] args) {
    testView();
  }

  public static void testView() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.store("Belajar java dasar");
    todoListService.store("Belajar java oop");
    todoListService.store("Belajar java standard classes");

    todoListView.view();
  }

}
