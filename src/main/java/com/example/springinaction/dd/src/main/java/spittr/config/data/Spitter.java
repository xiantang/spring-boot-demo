package spittr.config.data;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 */
public class Spitter {

    private Long id;

    @NotNull
    @Size(min=5, max=16)
    private String username;

    @NotNull
    @Size(min=5, max=25)
    private String password;

    @NotNull
    @Size(min=2, max=30)
    private String firstName;

    @NotNull
    @Size(min=2, max=30)
    private String lastName;

    @NotNull
    @Email
    private String email;

    public Spitter(Long id, @NotNull @Size(min = 5, max = 16) String username, @NotNull @Size(min = 5, max = 25) String password, @NotNull @Size(min = 2, max = 30) String firstName, @NotNull @Size(min = 2, max = 30) String lastName, @NotNull @Email String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Spitter() {
    }


    public Spitter(@NotNull @Size(min = 5, max = 16) String username, @NotNull @Size(min = 5, max = 25) String password, @NotNull @Size(min = 2, max = 30) String firstName, @NotNull @Size(min = 2, max = 30) String lastName, @NotNull @Email String email) {
        this(null, username, password, firstName, lastName, email);
    }
}
