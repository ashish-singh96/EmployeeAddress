package src.test.java.com.example.Employee.address.model;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String city;

    private String state;

    private String zipcode;

    // Constructors, getters, and setters
}
