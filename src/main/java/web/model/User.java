package web.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Should not be empty")
    @Column(name = "firstName", length = 45)
    private String firstName;

    @NotEmpty(message = "Should not be empty")
    @Column(name = "lastName", length = 45)
    private String lastName;

    @Min(value = 1, message = "Should be greater than 0")
    @Column(name = "age")
    private byte age;

    public User() {
    }

    public User(String firstName, String lastName, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
        User user = (User) o;
        return (age == user.age) &&
                (Objects.equals(id, user.id)) &&
                (Objects.equals(firstName, user.firstName)) &&
                (Objects.equals(lastName, user.lastName));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
