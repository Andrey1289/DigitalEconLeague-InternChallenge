package ru.liga.ppr.common.repository;

import ru.liga.ppr.common.entity.MFP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MFPRepository extends JpaRepository<MFP, String>, JpaSpecificationExecutor<MFP> {

}
