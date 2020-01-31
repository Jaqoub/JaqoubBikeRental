package model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bicycle {

    @Id
    private Long id;
    private String name;
    private String city;
    @OneToOne(cascade = CascadeType.ALL)
    private Postcodes postCodes;

    private int numberOfBicycles;

    public Bicycle(){}

    public Bicycle(Long id, String name, String city, Postcodes postcodes){
        this.id = id;
        this.name = name;
        this.city = city;
        this.postCodes = postcodes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Postcodes getPostCodes() {
        return postCodes;
    }

    public void setPostCodes(Postcodes postCodes) {
        this.postCodes = postCodes;
    }

    public int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public void setNumberOfBicycles(int numberOfBicycles) {
        this.numberOfBicycles = numberOfBicycles;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", postCodes=" + postCodes +
                ", numberOfBicycles=" + numberOfBicycles +
                '}';
    }
}
