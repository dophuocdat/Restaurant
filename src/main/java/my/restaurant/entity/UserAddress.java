package my.restaurant.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import my.restaurant.modal.AddressType;

@Table(name = "user_address")
@Entity
@Getter
@Setter
public class UserAddress extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "email_id", nullable = false)
    @NotNull
    private String emailId;

    @Column(name = "first_name", nullable = false)
    @NotNull
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotNull
    private String lastName;

    @Column(name = "street_address_1", nullable = false)
    @NotNull
    private String streetAddress1;

    @Column(name = "street_address_2")
    private String streetAddress2;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @NotNull
    @Column(name = "city")
    private String city;

    @Column(name = "postal_code", nullable = false)
    @NotNull
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "is_default")
    private boolean myDefault;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false)
    @NotNull
    private AddressType addressType;

}
