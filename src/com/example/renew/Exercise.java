package com.example.renew;


public class Exercise extends Habit {
    private String[] exerciseSub = {
        "Cardio",
        "Lifting",
        "Swimming",
        "Yoga",
        "Burn Calories",
        "Anaerobic"
    };

    public Exercise (String name, String description, String[] habitCategory) {
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
    

    public void setexerciseSub(String[] exerciseSub) {
        this.exerciseSub = exerciseSub;

    }

    public String[] getExerciseSub() {
        return exerciseSub;
        
    }
}
