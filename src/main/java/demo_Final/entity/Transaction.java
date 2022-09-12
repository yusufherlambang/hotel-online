package demo_Final.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Transactions")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Transaction {

    @Id
    @Column(name = "Id")
    @Getter@Setter
    private Long id;

    @Column(name = "CheckIn")
    @Getter@Setter
    private LocalDate checkIn;

    @Column(name = "CheckOut")
    @Getter@Setter
    private LocalDate checkOut;

    @Column(name = "TotalDays")
    @Getter@Setter
    private int totalDays;

    @Column(name = "Status")
    @Getter@Setter
    private String status;

    @Column(name = "Bills")
    @Getter@Setter
    private BigDecimal bills;

    @ManyToOne
    @JoinColumn(name = "RoomNumber",insertable = false,updatable = false)
    @Getter@Setter
    private Room room;

    @Column(name = "RoomNumber")
    @Getter@Setter
    private String roomNumber;


}
