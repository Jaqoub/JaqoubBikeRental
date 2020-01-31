package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Postcodes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer postCodes;
    private Long id;
    private String status;


    public Postcodes(){}



    public Postcodes(Long id, Integer postCode, String status) {
        this.id = id;
        this.postCodes = postCode;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPostCode() {
        return postCodes;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public void setPostCodes(Integer postCodes) {
        this.postCodes = postCodes;
    }

    @Override
    public String toString() {
        return "PostCodes{" +
                "id=" + id +
                ", postCode=" + postCodes +
                ", status='" + status + '\'' +
                '}';
    }
}
