package com.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.bean.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
