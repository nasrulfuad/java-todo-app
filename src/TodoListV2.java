import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;
import views.TodoListView;

public class TodoListV2 {

  public static void main(String[] args) {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListView.view();
  }

}
