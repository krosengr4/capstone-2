public class Sandwich extends MenuItem {

    //Sandwich attributes
    String size;
    String bread;
    String meat;
    String cheese;
    String toppings;
    String sauces;
    boolean isToasted;
    boolean isExtraMeat;
    boolean isExtraCheese;

    //constructor
    public Sandwich() {
        super("Sandwich");
    }

    //Overloaded constructor
    public Sandwich(String size, String bread, String meat, String cheese, String toppings, String sauces, boolean isToasted, boolean isExtraMeat, boolean isExtraCheese) {
        super("Sandwich");
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauces = sauces;
        this.isToasted = isToasted;
        this.isExtraMeat = isExtraMeat;
        this.isExtraCheese = isExtraCheese;
    }

    //region setters and getters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public boolean isHasMeat() {
        return this.meat != null;
    }

    public boolean isHasCheese() {
        return this.cheese != null;
    }

    public boolean isExtraMeat() {
        return isExtraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        isExtraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }
    //endregion

    //Override getValue method to get appropriate price of sandwich
    @Override
    public double getValue() {
        double value = 0.0;

        switch (this.size) {
            case "SMALL" -> {
                value = 5.5;

                //Calculate value for adding meat and cheese
                if (this.isHasMeat()) {
                    value += 1.00;
                }
                if (this.isHasCheese()) {
                    value += 0.75;
                }
                //Calculate value for adding EXTRA meat and cheese
                if (this.isExtraMeat()) {
                    value += 0.50;
                }
                if (this.isExtraCheese()) {
                    value += 0.30;
                }
            }
            case "MEDIUM" -> {
                value = 7.00;

                //Calculate value for adding meat and cheese
                if (this.isHasMeat()) {
                    value += 2.00;
                }
                if (this.isHasCheese()) {
                    value += 1.50;
                }
                //Calculate value for adding EXTRA meat and cheese
                if (this.isExtraMeat()) {
                    value += 1.00;
                }
                if (this.isExtraCheese()) {
                    value += 0.60;
                }
            }
            case "LARGE" -> {
                value = 8.50;

                //Calculate value for adding meat and cheese
                if (this.isHasMeat()) {
                    value += 3.00;
                }
                if (this.isHasCheese()) {
                    value += 2.25;
                }
                //Calculate value for adding EXTRA meat and cheese
                if (this.isExtraMeat()) {
                    value += 1.50;
                }
                if (this.isExtraCheese()) {
                    value += 0.90;
                }
            }
            default -> System.out.println("ERROR! Size needs to be SMALL, MEDIUM, OR LARGE!");
        }

        return value;
    }
}
