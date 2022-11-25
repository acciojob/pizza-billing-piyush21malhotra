package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean addExtraCheeseOneTime = false;
    private Boolean addExtraToppingsOneTime = false;
    private Boolean addTakeawayOneTime = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) {
            bill = "300";
            price = 300;
        }
        else {
            bill = "400";
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!addExtraCheeseOneTime) {
            bill = Integer.toString((Integer.parseInt(bill) + 80));
            addExtraCheeseOneTime = true;
        }
    }

    public void addExtraToppings(){

        if(!addExtraToppingsOneTime) {
            if (this.isVeg) {
                bill = Integer.toString((Integer.parseInt(bill) + 70));
            } else {
                bill = Integer.toString((Integer.parseInt(bill) + 120));
            }
            addExtraToppingsOneTime = true;
        }
    }

    public void addTakeaway() {
        if (!addTakeawayOneTime){
            bill = Integer.toString((Integer.parseInt(bill) + 20));
            addTakeawayOneTime = true;
        }
    }

    public String getBill(){

        if(isVeg) {
            System.out.println("Base Price Of The Pizza: 300");
        }
        else {
            System.out.println("Base Price Of The Pizza: 400");
        }

        if(addExtraCheeseOneTime) {
            System.out.println("Extra Cheese Added: 80");
        }

        if(addExtraToppingsOneTime) {
            if(isVeg) {
                System.out.println("Extra Toppings Added: 70");
            }
            else {
                System.out.println("Extra Toppings Added: 120");
            }
        }

        if(addTakeawayOneTime) {
            System.out.println("Paperbag Added: 20");
        }

        System.out.print("Total Price: ");
        return this.bill;
    }
}
