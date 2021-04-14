package com.example.stock.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Amitie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private boolean validation;
	private String dateValidation;



	public Amitie() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany (mappedBy = "amitie")
	private List<AmitieVille> amitieVilles;


	public Amitie(Long id, boolean validation, String dateValidation, List<AmitieVille> amitieVilles) {
		this.id = id;
		this.validation = validation;
		this.dateValidation = dateValidation;
		this.amitieVilles = amitieVilles;
	}

	public boolean isValidation() {
		return validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public String getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(String dateValidation) {
		this.dateValidation = dateValidation;
	}

	@Override
	public String toString() {
		return "Amitie{" +
				"id=" + id +
				", validation=" + validation +
				", dateValidation='" + dateValidation + '\'' +
				", userSource=" + //userSource +
				", userDestination=" + //userDestination +
				'}';
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Amitie)) return false;
		Amitie amitie = (Amitie) o;
		return Objects.equals(getId(), amitie.getId());
	}

	public List<AmitieVille> getAmitieVilles() {
		return amitieVilles;
	}

	public void setAmitieVilles(List<AmitieVille> amitieVilles) {
		this.amitieVilles = amitieVilles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}

