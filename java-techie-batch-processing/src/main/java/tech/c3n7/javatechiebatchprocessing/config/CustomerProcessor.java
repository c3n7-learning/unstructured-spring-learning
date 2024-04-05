package tech.c3n7.javatechiebatchprocessing.config;

import org.springframework.batch.item.ItemProcessor;
import tech.c3n7.javatechiebatchprocessing.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer item) throws Exception {
        item.setId(0);
        return item;
    }
}
