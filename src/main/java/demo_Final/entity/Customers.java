package demo_Final.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    @Getter @Setter
    private Long customerId;

    @Column(name = "FirstName")
    @Getter@Setter
    private String firstName;

    @Column(name = "LastName")
    @Getter @Setter
    private String lastName;

    @Column(name = "Email")
    @Getter @Setter
    private String email;

    @Column(name = "Address")
    @Getter @Setter
    private String address;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Username" ,insertable = false,updatable = false)
    @Getter @Setter
    private Account account;

    @Column(name = "Username")
    @Getter @Setter
    private String username;
}
