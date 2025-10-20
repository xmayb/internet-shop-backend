package com.example.demo.Base;


import com.example.demo.Expenses.Expense;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //One category - many expenses

    @OneToMany(mappedBy = "category")
    private List<Expense> expenses;

}
