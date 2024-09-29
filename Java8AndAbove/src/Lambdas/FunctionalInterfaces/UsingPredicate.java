/***
 * Predicate is a functional interface that returns a boolean
 * we have created here multiple predicates and based on requirement we are passing to the filter method
 * Predicate contains abstract method called test which returns boolean
 */

package Lambdas.FunctionalInterfaces;

import Lambdas.DataModel.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsingPredicate {
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
        //predicates
        Predicate<Fruit> isApple = (fruit) -> "APPLE".equals(fruit.getName());
        Predicate<Fruit> isGrape = (fruit) -> "GRAPE".equals(fruit.getName());
        Predicate<Fruit> isOrange = (fruit) -> "ORANGE".equals(fruit.getName());
        Predicate<Fruit> greenFruit = (fruit) -> "GREEN".equals(fruit.getColour());
        Predicate<Fruit> redFruit = (fruit) -> "RED".equals(fruit.getColour());
        Predicate<Fruit> indianFruit = (fruit) -> "INDIA".equals(fruit.getOrigin());
        Predicate<Fruit> lightFruit = (Fruit fruit) -> fruit.getWeight() < 50;
        Predicate<Fruit> heavyFruit = (Fruit fruit) -> fruit.getWeight() > 50;
        //printing different fruit details
        System.out.println("apples: "+filterFruits(fruits,isApple));
        System.out.println("oranges: "+filterFruits(fruits,isOrange));
        System.out.println("grapes: "+filterFruits(fruits,isGrape));
        //printing heavy fruits
        System.out.println("heavy fruits: "+filterFruits(fruits,heavyFruit));

        /**
         * below we are creating more complex filters by chaining the predicates
         * using methods: negate, and, or
         */

        List<Fruit> notGrapesAndHeavy = filterFruits(fruits,isGrape.negate().and(heavyFruit));
        List<Fruit> greenFruitAndLight = filterFruits(fruits,greenFruit.and(lightFruit));
        List<Fruit> redFruitOrIndian = filterFruits(fruits,redFruit.or(indianFruit));
        List<Fruit> redFruitOrIndianAndHeavy = filterFruits(fruits,redFruit.or(indianFruit).and(heavyFruit));
        System.out.println("\n\n=============Fruit those are not grape and Heavy==========\n");
        System.out.println(notGrapesAndHeavy);
        System.out.println("\n\n=============Fruit those are green and Light==========\n");
        System.out.println(greenFruitAndLight);
        System.out.println("\n\n=============Fruit those are red or Indian==========\n");
        System.out.println(redFruitOrIndian);
        System.out.println("\n\n=============Fruit those are red or Indian and Heavy==========\n");
        System.out.println(redFruitOrIndianAndHeavy);
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> p){
        List<Fruit> result = new ArrayList<>();
        for(Fruit fruit: fruits){
            if(p.test(fruit)){
                result.add(fruit);
            }
        }
        return result;
    }

}
