package com.hrspringboot.ProductService.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;
@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field("expense_name")
    @Indexed(unique = true)
    private String expenseName;
    @Field("expense_amount")
    private BigDecimal expenseAmount;
    @Field("expense_category")
    private ExpenseCategory expenseCategory;
    public Expense(String id, String expenseName, BigDecimal expenseAmount, ExpenseCategory expenseCategory) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
        this.expenseCategory = expenseCategory;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getExpenseName() {
        return expenseName;
    }
    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }
    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }
    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
}
