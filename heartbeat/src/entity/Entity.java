package entity;

import java.io.Serializable;

public class Entity implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Entity [name=" + name + ", type=" + type + "]";
    }

}