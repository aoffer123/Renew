package com.example.renew;

public class Financial extends Habit {
    private String[] financialSub = {
        "Save money",
        "No-spending",
        "Track expenses",
        "Follow a Budget",
        "Pay off Debt"
    };

    public Financial (String name, String description, String[] habitCategory) {
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
    

    public void setfinancialSub(String[] exerciseSub) {
        this.financialSub = exerciseSub;

    }

    public String[] getfinancialSub() {
        return financialSub;
        
    }

}