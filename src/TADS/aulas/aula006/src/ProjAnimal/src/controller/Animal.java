package controller;

public abstract class Animal {
    private int pernas = 0;
    public Animal(int pernas){
        this.pernas = pernas;
    }
    public abstract void come();

    public void caminha(){

    };
}
