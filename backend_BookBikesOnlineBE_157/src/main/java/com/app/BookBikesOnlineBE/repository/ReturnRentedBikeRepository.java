package com.app.BookBikesOnlineBE.repository;

import com.app.BookBikesOnlineBE.model.ReturnRentedBike;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ReturnRentedBikeRepository extends SimpleJpaRepository<ReturnRentedBike, String> {
    private final EntityManager em;
    public ReturnRentedBikeRepository(EntityManager em) {
        super(ReturnRentedBike.class, em);
        this.em = em;
    }
    @Override
    public List<ReturnRentedBike> findAll() {
        return em.createNativeQuery("Select * from \"bookbikesonlinebe\".\"ReturnRentedBike\"", ReturnRentedBike.class).getResultList();
    }
}