package ie.atu.bookprojectcicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private ObjectId id;
    private String author;
    private String country;
    private String imagelink;
    private String language;
    private String link;
    private int pages;
    private String title;
    private int year;
    @DocumentReference // will store ids of the review
    private List<Review> reviewIds;
}
