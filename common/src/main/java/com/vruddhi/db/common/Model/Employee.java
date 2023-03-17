package com.vruddhi.db.common.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Employee {
    public Employee(Integer id2, String name2, String email2) {
		this.id=id2;
		this.name=name2;
		this.email=email2;
	}
	@Id
    private int id;
    private String name;
    private String email;
}