package com.expensetracker;
import java.util.*;
public class SmartExpenseTrackerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ExpenseManager m=new ExpenseManager();
        while(true){
            System.out.println("1.Add Expense 2.View All 3.Exit");
            int ch=sc.nextInt(); sc.nextLine();
            if(ch==1){
                System.out.print("Category: "); String c=sc.nextLine();
                System.out.print("Amount: "); double a=sc.nextDouble(); sc.nextLine();
                System.out.print("Date(yyyy-mm-dd): "); String d=sc.nextLine();
                m.addExpense(new Expense(c,a,d));
            } else if(ch==2){
                m.getAll().forEach(System.out::println);
            } else break;
        }
    }
}