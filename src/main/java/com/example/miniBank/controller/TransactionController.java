package com.example.miniBank.controller;


import com.example.miniBank.model.Transaction;
import com.example.miniBank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;


    // DEPOSIT
    public Transaction deposit(@PathVariable Long userId, @RequestParam double amount){
        return transactionService.deposit(userId,amount);
    }


    // WITHDRAWAL
    @PostMapping("/withdraw/{userId}")
    public Transaction withdraw(@PathVariable Long userId, @RequestParam double amount){
        return transactionService.withdraw(userId, amount);
    }


    //GETTING TRANSACTION HISTORY

    @GetMapping("/{userId}")
    public List<Transaction> getTransactionHistory(@PathVariable Long userId){
        return transactionService.getTransactionByUserId(userId);
    }

}
