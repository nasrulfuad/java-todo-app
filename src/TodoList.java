public class TodoList {
  public static String[] model = new String[10];

  public  static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    viewMenu();
  }

  /**
   * Show todos
   */
  public  static void showTodos() {
    System.out.println("Todo List :");
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  public static void testShowTodos() {
    model[0] = "Task One";
    model[1] = "Task Two";

    showTodos();
  }

  /**
   * Store todo
   */
  public static void addTodo(String todo) {
    var isFull = true;

    /**
     * Check model full or not
     */
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        isFull = false;
        break;
      }
    }

    /**
     * Resize model if model was full
     */
    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];

      for (var i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  public static void testAddTodo() {
    for (var i = 0; i < 25; i++) {
      addTodo("Todo ke " + i);
    }

    showTodos();
  }

  /**
   * Remove todo
   */
  public static boolean removeTodo(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (int i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }

      return true;
    }
  }

  public static void testRemoveTodo() {
    addTodo("One");
    addTodo("Two");
    addTodo("Three");

    var result = removeTodo(20);
    System.out.println(result);

    result = removeTodo(4);
    System.out.println(result);

    result = removeTodo(2);
    System.out.println(result);

    showTodos();
  }

  public static String input(String info) {
    System.out.print(info + " : ");

    String data = scanner.nextLine();

    return data;
  }

  public static void testInput() {
    var name = input("Nama");

    System.out.println("Hi " + name);

    var channel = input("Channel");

    System.out.println(channel);
  }

  /**
   * Show menus
   */
  public static void viewMenu() {
    while (true) {
      showTodos();

      System.out.println("Menu :");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var input = input("Pilih");

      if (input.equals("1")) {
        viewAddTodo();
      } else if(input.equals("2")) {
        viewRemoveTodo();
      } else if(input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak di mengerti");
      }
    }
  }

  public static void testViewMenu() {
    addTodo("One");
    addTodo("Two");
    addTodo("Three");
    addTodo("Four");
    addTodo("Five");

    viewMenu();
  }

  /**
   * Show add
   */
  public static void viewAddTodo() {
    System.out.println("Menambah Todo");

    var todo = input("Todo (x jika batal)");

    if (todo.equals("x")) {
      // batal
    }else {
      addTodo(todo);
    }
  }

  public static void testViewAddTodo() {
    addTodo("One");

    addTodo("Two");

    viewMenu();

    showTodos();
  }

  /**
   * Show remove
   */
  public static void viewRemoveTodo() {
    System.out.println("Hapus Todo List");

    var number = input("Nomor yang di hapus (x jika batal)");

    if (number.equals("x")) {
      // batal
    } else {
      boolean success = removeTodo(Integer.valueOf(number));

      if (!success) {
        System.out.println("Gagal menghapus todo list : " + number);
      }
    }
  }

  public static void testViewRemoveTodo() {
    addTodo("One");

    addTodo("Two");

    addTodo("Three");

    showTodos();

    viewRemoveTodo();

    showTodos();
  }
}
