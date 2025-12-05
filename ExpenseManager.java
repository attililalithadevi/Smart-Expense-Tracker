package com.expensetracker;
import java.util.*;
public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();
    public void addExpense(Expense e){ expenses.add(e); }
    public List<Expense> getAll(){ return expenses; }
}