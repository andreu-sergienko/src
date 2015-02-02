package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Ksu on 18.08.14.
 */
public class SubSolution extends Solution {
    public SubSolution(String pub1) {
        super(pub1);
    }

    public SubSolution(Object pub2) {
        super(pub2);
    }

    public SubSolution(Integer pub3) {
        super(pub3);
    }

    protected SubSolution(Character prot1) {
        super(prot1);
    }

    protected SubSolution(Double prot2) {
        super(prot2);
    }

    protected SubSolution(Exception prot3) {
        super(prot3);
    }

     SubSolution(Short pr1) {
        super(pr1);
    }

     SubSolution(Long pr2) {
        super(pr2);
    }

     SubSolution(char pr3) {
        super(pr3);
    }

    private SubSolution(Number priv1){
        super(priv1);
    }

    private SubSolution(Boolean priv2){
        super(priv2);
    }

    private SubSolution(Float priv3){
        super(priv3);
    }
}
