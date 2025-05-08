package app;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();


        userRepository.addUser(new User(1, "Родіон Плахотнюк", "rodion@example.com"));
        userRepository.addUser(new User(2, "Марія Іваненко", "maria.ivanenko@example.com"));
        userRepository.addUser(new User(3, "Дмитро Мазур", "dmytro.mazur@example.com"));


        Optional<User> userById = userRepository.findUserById(2);
        if (userById.isPresent()) {
            System.out.println("Знайдено користувача за id: " + userById.get());
        } else {
            System.out.println("Користувача з таким id не знайдено.");
        }


        Optional<User> userByEmail = userRepository.findUserByEmail("maria.ivanenko@example.com");
        if (userByEmail.isPresent()) {
            System.out.println("Знайдено користувача за email: " + userByEmail.get());
        } else {
            System.out.println("Користувача з таким email не знайдено.");
        }


        Optional<List<User>> allUsers = userRepository.findAllUsers();
        if (allUsers.isPresent()) {
            System.out.println("Кількість користувачів: " + allUsers.get().size());
            System.out.println("Список користувачів: " + allUsers.get());
        } else {
            System.out.println("Список користувачів порожній.");
        }


        Optional<User> nonExistentUser = userRepository.findUserById(4);
        if (nonExistentUser.isPresent()) {
            System.out.println("Знайдено користувача: " + nonExistentUser.get());
        } else {
            System.out.println("Користувача з таким id не знайдено.");
        }

        Optional<List<User>> emptyList = new UserRepository().findAllUsers();
        if (emptyList.isPresent()) {
            System.out.println("Кількість користувачів в порожньому репозиторії: " + emptyList.get().size());
        } else {
            System.out.println("Список користувачів в порожньому репозиторії порожній.");
        }
    }
}

