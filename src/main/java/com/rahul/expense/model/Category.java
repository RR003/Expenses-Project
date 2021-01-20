package com.rahul.expense.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "category")
public class Category {

    @Id
    private Long id;

    // Travel ,grocery, etc
    @NotNull
    private String name;

    public long getId() {
        return id;
    }
}
