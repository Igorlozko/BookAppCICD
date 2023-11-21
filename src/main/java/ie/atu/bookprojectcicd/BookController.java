package ie.atu.bookprojectcicd;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<List<Book>>(bookService.allBooks(),HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Optional<Book>> getSingleBook(@PathVariable String bookId){
        return new ResponseEntity<Optional<Book>>(bookService.singleBook(bookId),HttpStatus.OK);
    }
}
