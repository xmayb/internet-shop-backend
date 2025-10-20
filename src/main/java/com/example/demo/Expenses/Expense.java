package com.example.demo.Expenses;


import com.example.demo.Base.Category;
import com.example.demo.entity.User;
import jakarta.persistence.*;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String description;

    //Many expenses belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //Each expense belongs to one category
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
