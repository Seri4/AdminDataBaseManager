package entites;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="PHONENUMBER")
    private String phoneNumber;

    @Column(name="NICKNAME")
    private String nickname;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="TYPE")
    private UserType type;

    public User(String phoneNumber, String nickname, String password, UserType type) {
        this.phoneNumber = phoneNumber;
        this.nickname = nickname;
        this.password = password;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
