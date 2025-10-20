package com.example.demo.entity;


import com.example.demo.Expenses.Expense;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    //One user - many expenses
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Expense> expenses;
}