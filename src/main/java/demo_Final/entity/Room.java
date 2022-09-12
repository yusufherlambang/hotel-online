package demo_Final.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Room")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Room {

    @Id
    @Column(name = "RoomNumber")
    @Getter @Setter
    private String roomNumber;

    @Column(name = "Type")
    @Getter@Setter
    private String type;

    @Column(name = "Price")
    @Getter@Setter
    private BigDecimal price;

    @Column(name = "Status")
    @Getter@Setter
    private String status;
}
