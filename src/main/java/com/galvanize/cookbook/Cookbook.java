/**
 * A Cookbook...
 * - contains recipes
 * - can search recipes
 * - can create new recipes
 * - can add existing recipes
 * - can add multiple recipes at a time
 */
package com.galvanize.cookbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cookbook {
    private int count;

    public Cookbook() {
        this.count = 0;
    }

    public int recipeCount() {
        return this.count;
    }

    public void createRecipe(String recipePath) {
        try (Stream<String> stream = Files.lines(Paths.get(recipePath))) {
            stream.forEach(System.out::println);
            this.count += 1;
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
