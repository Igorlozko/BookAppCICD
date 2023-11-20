package ie.atu.bookprojectcicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @GetMapping
    public ResponseEntity<String> allBooks(){
        return new ResponseEntity<String>("All Books", HttpStatus.OK); // return the message all books but with a status of 200 helps with front end
    }
   /* public String allBooks(){
        return "All Books";
    }*/
}
