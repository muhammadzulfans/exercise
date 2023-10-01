package practice.oop;


import practice.oop.Duck;
import practice.oop.Quack;
import practice.oop.FlyNoWay;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ModelDuck extends Duck {
    
    public ModelDuck() {
       flyBehavior = new FlyNoWay();
       quackBehavior = new Quack(); 
    }
    
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
