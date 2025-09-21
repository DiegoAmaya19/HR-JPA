package com.devsenior.diego.hr_jpa.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "countries")
public class Country {
    
    @Id
    @Column(name = "country_id", length = 2)
    private String id;

    @Column(name = "country_name", length = 40)
    private String name;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id", referencedColumnName = "region_id")
    private Region region;
}
