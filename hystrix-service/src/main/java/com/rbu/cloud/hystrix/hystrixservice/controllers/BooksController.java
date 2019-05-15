    package com.rbu.cloud.hystrix.hystrixservice.controllers;

    import com.rbu.cloud.hystrix.hystrixservice.entities.Book;
    import com.rbu.cloud.hystrix.hystrixservice.repositories.BookRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    public class BooksController {

        @Autowired
        private BookRepository bookRepository;

        @GetMapping(value = "/books")
        public List<Book> getAll() {
            return bookRepository.findAll();
        }

    @GetMapping(value = "/books/{author}")
    public List<Book> getByAuthor(@PathVariable(value = "author") String author) {
        return bookRepository.findByAuthor(author);
    }

    @PostMapping(value = "/books")
    public void saveBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

}
