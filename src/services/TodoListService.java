package services;

public interface TodoListService {

  void view();

  void store(String todo);

  void remove(Integer number);

}
