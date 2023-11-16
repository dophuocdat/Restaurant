package my.restaurant.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import my.restaurant.modal.AddressType;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "first_name")
    @NotNull
    public String firstName;

    @Column(name = "last_name")
    @NotNull
    public String lastName;

    @Column(name = "street_address_1")
    @NotNull
    public String streetAddress1;

    @Column(name = "street_address_2")
    public String streetAddress2;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @NotNull
    @Column(name = "city")
    public String city;

    @Column(name = "postal_code")
    @NotNull
    public String postalCode;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false)
    private AddressType addressType;

    @OneToMany(mappedBy = "billingAddress")
    private List<Order> orders = new ArrayList<>();

    public Address(long id) {
        this.addressId = id;
    }

    public Address() {

    }

}
