package sn.atos.gastro_and_me.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import sn.atos.gastro_and_me.entities.enums.Speciality;

/**
 *
 * @author rubix
 */
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @Column(name = "name", nullable = false)
    @NotEmpty
    String name;
    
    @Column(name = "address")
    String address;
    
    @Column(name = "phone_number")
    String phoneNumber;
    
    @Column(name = "speciality")
    @Enumerated(EnumType.STRING)
    Speciality speciality;
}
