package com.matancita.all;

import java.io.Serializable;
import javax.persistence.*;


import lombok.Data;

/**
 *
 * @author manue
 */
@Entity
@Table(name="employee")
@Data
class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
}
