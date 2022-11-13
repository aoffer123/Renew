package com.example.renew;

public class Wellbeing extends Habit {
    private String[] wellbeingSub = {
        "Breathing",
        "Meditation",
        "Read a Book",
        "Learning",
        "Review Today",
        "Mind Clearning Activity",
        "Journaling"
    };

    public Wellbeing (String name, String description, String[] habitCategory) {
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
    

    public void setwellbeingSub(String[] exerciseSub) {
        this.wellbeingSub = exerciseSub;

    }

    public String[] getwellbeingSub() {
        return wellbeingSub;
        
    }
}


