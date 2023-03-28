package model;

import java.util.Objects;

/**
 *
 * @author alejandro
 */
public class Pokemon {
    private String name;
    private String height;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Pokemon{" + "name=" + name + ", height=" + height + ", weight=" + weight + '}';
    }
    
    
}
