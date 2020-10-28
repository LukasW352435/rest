package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository for Employee
// Adds:
// - Create new instances
// - Updating existing ones
// - Deleting
// - Finding (one, all, by simple or complex properties)
interface EmployeeRepository extends  JpaRepository<Employee, Long>{
}
