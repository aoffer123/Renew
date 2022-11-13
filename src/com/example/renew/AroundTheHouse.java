package com.example.renew;

public class AroundTheHouse extends Habit {
    private String[] houseSub = {
        "Cleaning",
        "Organizing",
        "Meal Prep",
        "Check Email",
        "Homework",
        "Finish To-Do List"
    };

    public AroundTheHouse (String name, String description, String[] habitCategory) {
        super(name, description, habitCategory);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);

    }
    

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() { 
        return super.getName();
    }

    @Override
    public void setHabitCategory(String[] habitCategory) {
        super.setHabitCategory(habitCategory);
    }
    @Override
    public String[] getHabitCategory() {
        return super.getHabitCategory();
    }
    

    public void houseSub(String[] exerciseSub) {
        this.houseSub = exerciseSub;

    }

    public String[] gethouseSub() {
        return houseSub;
        
    }

}