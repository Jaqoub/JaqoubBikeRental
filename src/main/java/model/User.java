package model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private String name;
    private int numberOfBicycles;
    private String startTime;
    private String endTime;
    private String city;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @OneToOne(cascade = CascadeType.ALL)
    private Postcodes postCodes;
    @ManyToMany(mappedBy = "assignedBicycles", cascade = CascadeType.ALL)
    private List<Bicycle> assignedBicycle;

   public User(){}


    public User(Long id, String name, String email) {
    }


    public User(String address, String name, int numberOfBicycles, String startTime,
                String endTime, String city, Postcodes postCodes, List<Bicycle> assignedBicycle) {
        this.address = address;
        this.name = name;
        this.numberOfBicycles = numberOfBicycles;
        this.startTime = startTime;
        this.endTime = endTime;
        this.city = city;
        this.postCodes = postCodes;
        this.assignedBicycle = assignedBicycle;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public void setNumberOfBicycles(int numberOfBicycles) {
        this.numberOfBicycles = numberOfBicycles;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public List<Bicycle> getAssignedBicycle() {
        return assignedBicycle;
    }

    public void setAssignedBicycle(List<Bicycle> assignedBicycle) {
        this.assignedBicycle = assignedBicycle;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", numberOfBicycles=" + numberOfBicycles +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", city='" + city + '\'' +
                ", postCodes=" + postCodes +
                ", assignedBicycle=" + assignedBicycle +
                '}';
    }
}