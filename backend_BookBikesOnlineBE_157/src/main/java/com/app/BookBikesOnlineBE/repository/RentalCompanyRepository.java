package com.app.BookBikesOnlineBE.repository;

import com.app.BookBikesOnlineBE.model.RentalCompany;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RentalCompanyRepository extends SimpleJpaRepository<RentalCompany, String> {
    private final EntityManager em;
    public RentalCompanyRepository(EntityManager em) {
        super(RentalCompany.class, em);
        this.em = em;
    }
    @Override
    public List<RentalCompany> findAll() {
        return em.createNativeQuery("Select * from \"bookbikesonlinebe\".\"RentalCompany\"", RentalCompany.class).getResultList();
    }
}