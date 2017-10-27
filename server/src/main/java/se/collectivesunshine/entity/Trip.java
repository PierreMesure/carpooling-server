package se.collectivesunshine.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TRIP")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "START_PLACE_ID", nullable = false)
    private Place startPlace;

    @OneToOne
    @JoinColumn(name = "END_PLACE_ID", nullable = false)
    private Place endPlace;

    @Column(name = "TIME", nullable = false)
    private Date time;

    @Column(name = "REGULARITY", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Regularity regularity;

    private enum Regularity {
        DAY, WEEKDAY, WEEK;
    }
}
