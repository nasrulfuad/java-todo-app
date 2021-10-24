package repositories;

import entities.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
  public TodoList[] data = new TodoList[10];

  @Override
  public TodoList[] getAll() {
    return data;
  }

  /**
   * Check model full or not
   */
  public boolean isFull() {
    var isFull = true;

    for (var i = 0; i < data.length; i++) {
      if (data[i] == null) {
        isFull = false;
        break;
      }
    }

    return isFull;
  }

  /**
   * Resize model if model was full
   */
  public void resizeIfFull() {
    if (isFull()) {
      var temp = data;
      data = new TodoList[data.length * 2];

      for (var i = 0; i < temp.length; i++) {
        data[i] = temp[i];
      }
    }
  }

  @Override
  public void store(TodoList todoList) {
    resizeIfFull();

    /**
     * Tambahkan ke posisi yang data arraynya NULL
     */
    for (var i = 0; i < data.length; i++) {
      if (data[i] == null) {
        data[i] = todoList;
        break;
      }
    }
  }

  @Override
  public boolean remove(Integer number) {
    if ((number - 1) >= data.length) {
      return false;
    } else if (data[number - 1] == null) {
      return false;
    } else {
      for (int i = (number - 1); i < data.length; i++) {
        if (i == (data.length - 1)) {
          data[i] = null;
        } else {
          data[i] = data[i + 1];
        }
      }

      return true;
    }
  }
}
