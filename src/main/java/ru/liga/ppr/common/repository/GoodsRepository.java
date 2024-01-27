package ru.liga.ppr.common.repository;

import ru.liga.ppr.common.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GoodsRepository extends JpaRepository<Goods, String>, JpaSpecificationExecutor<Goods> {

}
