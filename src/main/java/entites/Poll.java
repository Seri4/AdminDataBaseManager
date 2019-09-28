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
@Table(name="poll")
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @OneToMany
    @JoinColumn(name="QUESTIONS")
    private List<Question> questions;

    public Poll(List<Question> questions) {
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
