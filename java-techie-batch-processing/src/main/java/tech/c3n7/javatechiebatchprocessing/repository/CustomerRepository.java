package tech.c3n7.javatechiebatchprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.c3n7.javatechiebatchprocessing.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
