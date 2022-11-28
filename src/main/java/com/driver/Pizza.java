package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int takeAwayPrice;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeawayAdded;
    private Boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeawayAdded = false;
        this.isBillGenerated = false;

        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;

        this.isVeg = isVeg;
        if(this.isVeg) {
            this.price = 300;
            this.extraToppingsPrice = 70;
        }
        else {
            this.price = 400;
            this.extraToppingsPrice = 120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            this.price = this.price + extraCheesePrice;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            this.price = this.price + extraToppingsPrice;
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!isTakeawayAdded){
            this.price = this.price + takeAwayPrice;
            this.isTakeawayAdded = true;
        }
    }

    public String getBill(){

        if(!isBillGenerated) {

            isBillGenerated = true;

            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }

            if (isToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }

            if (isTakeawayAdded) {
                this.bill += "Paperbag Added: " + this.takeAwayPrice + "\n";
            }

            this.bill += "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
