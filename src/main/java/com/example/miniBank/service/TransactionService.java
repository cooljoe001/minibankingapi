package com.example.miniBank.service;

import com.example.miniBank.model.Transaction;
import com.example.miniBank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;



@Service
public class TransactionService {

@Autowired
private TransactionRepository transactionRepository;

public Transaction deposit(Long userId, double amount){
 try{
     Transaction transaction = new Transaction();
     transaction.setAmount(amount);
     transaction.setType("deposit");
     transaction.setTimestamp(LocalDateTime.now());
     return transactionRepository.save(transaction);
 } catch (Exception e) {
     System.out.println("Deposit exception: " + e.getMessage());
     return  null;
 }
 }

 public Transaction withdraw(Long userId, double amount) {
    try {
        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setType("Withdrawal");
        transaction.setTimestamp(LocalDateTime.now());
        return transactionRepository.save(transaction);
    } catch(Exception e) {
        System.out.println("Withdrawal Exception"+ e.getMessage());
        return null;
    }
    }


 public List<Transaction>getTransactionByUserId(Long userId){
    return transactionRepository.findByUserId(userId);
 }



}
