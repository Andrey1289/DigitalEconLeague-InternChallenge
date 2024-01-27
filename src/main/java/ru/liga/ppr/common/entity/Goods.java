package ru.liga.ppr.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "GOODS", uniqueConstraints = @UniqueConstraint(columnNames = {"producer", "model"}))
@Entity()
public class Goods {

  @Id
  @Column
  public String model;

  @Column
  public String producer;

  @Column
	public String type;

}

