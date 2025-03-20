package ru.luxtington.appProducer.model;

public class Computer {
    private int id;
    private String buildTitle;
    private int cost;
    private int yearOfProduce;

    public Computer() {
    }

    public Computer(int id, String buildTitle, int cost, int yearOfProduce) {
        this.id = id;
        this.buildTitle = buildTitle;
        this.cost = cost;
        this.yearOfProduce = yearOfProduce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildTitle() {
        return buildTitle;
    }

    public void setBuildTitle(String buildTitle) {
        this.buildTitle = buildTitle;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public void setYearOfProduce(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", buildTitle='" + buildTitle + '\'' +
                ", cost=" + cost +
                ", yearOfProduce=" + yearOfProduce +
                '}';
    }
}
