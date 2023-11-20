package ie.atu.bookprojectcicd;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Book, ObjectId> {
    Review insert(Review review);
}
