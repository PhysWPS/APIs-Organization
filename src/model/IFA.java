package model;

public class IFA {
    private String name;
    private int quantity;
    private Type type; // deve conter apenas sólido, líquido, pó

    public IFA(String name, int quantity, Type type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Type getType() {
        return type;
    }
}
