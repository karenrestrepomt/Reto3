package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "games")

public class Games  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String developer;
    private Integer year;
    private String description;

    @OneToMany (cascade = {CascadeType.PERSIST})
    @JsonIgnoreProperties({"games","client"})
    private List<Messages> messages;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("games")
    public Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "games")
    @JsonIgnoreProperties({"games","messages"})
    public List<Reservation> reservations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
