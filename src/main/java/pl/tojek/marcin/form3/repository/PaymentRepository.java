package pl.tojek.marcin.form3.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.tojek.marcin.form3.model.Payment;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository extends MongoRepository<Payment,UUID> {
}
