package org.launchcode.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode
 */
public class Cheese {

    @NotNull                    //this field should be not null while validating
    @Size(min=3, max=15)        //should be a specific size
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    private CheeseType type;    //

    private int cheeseId;
    private static int nextId = 1;

    public Cheese(String name, String description) {
        this();                           // call the default constructor public Cheese() on line30
        this.name = name;
        this.description = description;
    }

    public Cheese() {
        cheeseId = nextId;  // we need to initialize the cheeseId and when this nextId is in use we need to increment by one
        nextId++;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
}
