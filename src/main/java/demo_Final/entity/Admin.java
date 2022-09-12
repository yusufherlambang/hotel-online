package demo_Final.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Admin {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(name = "Name")
    @Getter @Setter
    private String name;

    @Column(name = "jobTitle")
    @Getter @Setter
    private String jobTitle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Username",insertable = false,updatable = false)
    @Getter @Setter
    private Account account;

    @Column(name = "Username")
    @Getter @Setter
    private String username;


}
