package backend.development.booking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "accommodations")
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private Address location;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String amenities;
    @Column(nullable = false)
    private BigDecimal dalyRate;
    @Column(nullable = false)
    private Address address;
    @Column(nullable = false)
    private Integer availability;

}
