package com.example.renew;


public class Habit {
    private String name;
    private String description;
    private String[] habitCategory = {
        "Exercise",
        "Health",
        "WellBeing",
        "Financial",
        "Around the house",
        "Custom Habit"
    };

    public Habit() {
        name = "No title";
        description = "No notes";
        
    }
    
    public Habit(String name, String description, String[] habitCategory) {
        this.name = name;
        this.description = description;
        this.habitCategory = habitCategory;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHabitCategory(String[] habitCategory) {
        this.habitCategory = habitCategory;
    }

    public String[] getHabitCategory() {
        return habitCategory;
    }

    

    
}
