//package ru.gb.myspringdemo;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.stereotype.Component;
//import ru.gb.myspringdemo.model.Book;
//import ru.gb.myspringdemo.model.Issue;
//import ru.gb.myspringdemo.model.Reader;
//import ru.gb.myspringdemo.model.User;
//import ru.gb.myspringdemo.repository.BookRepository;
//import ru.gb.myspringdemo.repository.IssueRepository;
//import ru.gb.myspringdemo.repository.ReaderRepository;
//import ru.gb.myspringdemo.repository.UserRepository;
//
//@Component
//public class TestDataGenerator {
//
//    private final BookRepository bookRepository;
//    private final IssueRepository issueRepository;
//    private final ReaderRepository readerRepository;
//    private final UserRepository userRepository;
//
//    static long id = 1L;
//
//    public TestDataGenerator(BookRepository bookRepository, IssueRepository issueRepository, ReaderRepository readerRepository, UserRepository userRepository) {
//        this.bookRepository = bookRepository;
//        this.issueRepository = issueRepository;
//        this.readerRepository = readerRepository;
//        this.userRepository = userRepository;
//    }
//
//    @PostConstruct
//    public void generateData() {
//        bookRepository.save(new Book("Война и мир"));
//        bookRepository.save(new Book("Мертвые души"));
//        bookRepository.save(new Book("Чистый код"));
//        bookRepository.save(new Book("Зов Ктулху"));
//        bookRepository.save(new Book("Атлант расправил плечи"));
//        readerRepository.save(new Reader("Читатель1"));
//        readerRepository.save(new Reader("Читатель2"));
//        readerRepository.save(new Reader("Читатель3"));
//        readerRepository.save(new Reader("Читатель4"));
//        readerRepository.save(new Reader("Читатель5"));
//        issueRepository.save(new Issue(1, 1));
//        issueRepository.save(new Issue(3, 1));
//        issueRepository.save(new Issue(2, 2));
//        issueRepository.save(new Issue(4, 2));
//        issueRepository.save(new Issue(5, 3));
//        issueRepository.save(new Issue(3, 3));
//        issueRepository.save(new Issue(4, 4));
//        issueRepository.save(new Issue(2, 4));
//        issueRepository.save(new Issue(3, 5));
//        issueRepository.save(new Issue(1, 5));
//    }
//
//    @PostConstruct
//    public void generateUsers() {
//        saveUser(userRepository, "admin");
//        saveUser(userRepository, "reader");
//        saveUser(userRepository, "auth");
//    }
//
//    public void saveUser(UserRepository userRepository, String login) {
//        User user = new User();
//        user.setId(id++);
//        user.setLogin(login);
//        user.setPassword(login);
//        user.setRole(login);
//        userRepository.save(user);
//    }
//
//}
