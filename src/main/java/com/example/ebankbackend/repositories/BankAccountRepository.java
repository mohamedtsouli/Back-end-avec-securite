package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entities.BankAccount;
import com.example.ebankbackend.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
