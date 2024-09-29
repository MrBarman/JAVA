/**
 * Consumer is a functional interface which contains a method called accept
 * The accept method take an object of generic type T and does not return anything
 */

package Lambdas.FunctionalInterfaces;

import Lambdas.DataModel.Fruit;

import java.util.List;
import java.util.function.Consumer;

public class UsingConsumer {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit("APPLE",10,"RED","USA"),
                new Fruit("APPLE",15,"GREEN","USA"),
                new Fruit("APPLE",10,"RED","INDIA"),
                new Fruit("ORANGE",10,"ORANGE","INDIA"),
                new Fruit("ORANGE",100,"ORANGE","INDIA"),
                new Fruit("APPLE",10,"RED","FRANCE"),
                new Fruit("GRAPE",100,"RED","FRANCE"),
                new Fruit("GRAPE",150,"RED","INDIA")
        );
        Consumer<Fruit> fruitConsumer = System.out::println;
        printFruitDetails(fruits,fruitConsumer);
    }

    private static void printFruitDetails(List<Fruit> fruits, Consumer<Fruit> c) {
        for(Fruit fruit: fruits){
            c.accept(fruit);
        }
    }
}
