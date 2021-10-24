package views;

import services.TodoListService;
import utils.InputUtil;

public class TodoListView {
  private TodoListService todoListService;

  public TodoListView(TodoListService todoListService) {
    this.todoListService = todoListService;
  }

  public void view() {
    while (true) {
      todoListService.view();

      System.out.println("Menu :");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var input = InputUtil.input("Pilih");

      if (input.equals("1")) {
        store();
      } else if(input.equals("2")) {
        remove();
      } else if(input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak di mengerti");
      }
    }
  }

  public void store() {
    System.out.println("Menambah Todo");

    var todo = InputUtil.input("Todo (x jika batal)");

    if (todo.equals("x")) {
      // batal
    }else {
      todoListService.store(todo);
    }
  }

  public void remove() {

  }

}
