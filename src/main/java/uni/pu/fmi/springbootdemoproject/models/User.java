package uni.pu.fmi.springbootdemoproject.models;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "app_users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate bDate;


    public Long getId()
    {
        return id;
    }


    public void setId(Long id)
    {
        this.id = id;
    }


    public User(String firstName, String lastName, LocalDate bDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bDate = bDate;
    }


    public User()
    {
    }


    public String getFirstName()
    {
        return firstName;
    }


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }


    public String getLastName()
    {
        return lastName;
    }


    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    public LocalDate getbDate()
    {
        return bDate;
    }


    public void setbDate(LocalDate bDate)
    {
        this.bDate = bDate;
    }


}
