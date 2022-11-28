package com.example.renew;




public class Health extends Habit {
   public String[] healthSub = {
        "Drink Water",
        "Eat Fruits",
        "Eat Vegetables",
        "No sugar",
        "Sleep early"
        
   };
   

    public Health (String name, String description, String[] habitCategory) {
        super(name, description);
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
    

    public void setItems(String[] healthSub) {
        this.healthSub = healthSub;

    }

    public String[] gethealthSub() {
        return healthSub;
        
    }
}

    

