package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.Vechile;
 
@Repository
public interface VechileRepository extends JpaRepository<Vechile, Integer>{
 
}