package ru.liga.ppr.common.repository;

import ru.liga.ppr.common.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComputerRepository extends JpaRepository<Computer, String>, JpaSpecificationExecutor<Computer> {

}
