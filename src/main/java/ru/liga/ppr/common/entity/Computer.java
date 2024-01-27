package ru.liga.ppr.common.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "COMPUTER")
@Entity()
public class Computer {

  @Id
  @Column
  public Integer code;

  @ManyToOne
  @JoinColumn(name = "model")
  public Goods model;

  @Column
  public Integer frequency;

  @Column
  public BigDecimal price;

}