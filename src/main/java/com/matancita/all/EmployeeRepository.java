package com.matancita.all;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author manue
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
