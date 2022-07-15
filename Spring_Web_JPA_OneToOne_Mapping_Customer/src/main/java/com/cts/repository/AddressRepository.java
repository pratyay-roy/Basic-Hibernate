package com.cts.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.model.Account;
 
@Repository
public interface AddressRepository extends JpaRepository<Account, Integer>{
 
}
