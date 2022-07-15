package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.DebitCard;
 
@Repository
public interface DebitCardRepository extends JpaRepository<DebitCard, Integer>{
 
}
