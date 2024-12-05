package com.app.BookBikesOnlineBE.repository;

import com.app.BookBikesOnlineBE.model.Payment;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PaymentRepository extends SimpleJpaRepository<Payment, String> {
    private final EntityManager em;
    public PaymentRepository(EntityManager em) {
        super(Payment.class, em);
        this.em = em;
    }
    @Override
    public List<Payment> findAll() {
        return em.createNativeQuery("Select * from \"bookbikesonlinebe\".\"Payment\"", Payment.class).getResultList();
    }
}