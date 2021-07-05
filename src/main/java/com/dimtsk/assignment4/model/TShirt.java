package com.dimtsk.assignment4.model;

public class TShirt{

    private String size;
    private String color;
    private String fabric;

    public TShirt() {
    }

    public TShirt(String size, String color, String fabric) {
        this.size = size;
        this.color = color;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%s\t\t%s", size, color, fabric);
    }

}
