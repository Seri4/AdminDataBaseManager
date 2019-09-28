package entites;

import java.util.List;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="problem")
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @OneToOne
    @JoinColumn(name="POLL")
    private Poll poll;

    @OneToMany
    @Column(name="COMMENTS")
    private List<Comment> comments;

    public Problem() {
    }

    public Problem(String name, String description, Poll poll, List<Comment> comments) {
        this.name = name;
        this.description = description;
        this.poll = poll;
        this.comments = comments;
    }

    public int getId() {
        return id;
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

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
