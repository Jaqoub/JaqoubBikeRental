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
    @JsonManagedReference
    private List<Bicycle> assignedBicycle;
    private int numberOfBicycles;

    public Bicycle(){}

    public Bicycle(Postcodes postCodes){
        this.postCodes = postCodes;
    }

    public Bicycle(Long id, String name, List<Bicycle> assignedBicycle, Postcodes postCodes){
        this.postCodes = postCodes;
    }

    public List<Bicycle> getAssignedBicycle(){return assignedBicycle;}

    public void setAssignedBicycle(List<Bicycle> assignedBicycle){this.assignedBicycle = assignedBicycle;}

    public int getNumberOfBicycles(){return numberOfBicycles;}

    public void setNumberOfBicycles(int numberOfBicycles){this.numberOfBicycles = numberOfBicycles;}


    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assignedBicycle=" + assignedBicycle +
                ", numberOfBicycles=" + numberOfBicycles +
                '}';
    }
}
