package com.hrspringboot.ProductService.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    public void addExpense() {
    }
    public void getExpenseByName() {
    }
    public void getAllExpenses() {
    }
    public void updateExpense() {
    }
    public void deleteExpense() {
    }

}
//in order to implement these methods, we need a service layer,
// so we are creating a package named service and a class named ExpenseService.java
