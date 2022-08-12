package com.example.api.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {

    @NotEmpty(message = "Name is required")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
