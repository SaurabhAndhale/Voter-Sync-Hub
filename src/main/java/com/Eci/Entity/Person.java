package com.Eci.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Person implements Serializable {
	@Id
	private int Addhar_id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "voterid", unique = true, nullable = true, referencedColumnName = "voter_id")
	private VotingCard voterid;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address", referencedColumnName = "house_no")
	private Address address;

	public Person() {
		super();
	}

	public Person(int addhar_id, String name, VotingCard voterid, Address address) {
		super();
		Addhar_id = addhar_id;
		this.name = name;
		this.voterid = voterid;
		this.address = address;
	}

	public int getAddhar_id() {
		return Addhar_id;
	}

	public void setAddhar_id(int addhar_id) {
		Addhar_id = addhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VotingCard getVoterid() {
		return voterid;
	}

	public void setVoterid(VotingCard voterid) {
		this.voterid = voterid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [Addhar_id=" + Addhar_id + ", name=" + name + ", voterid=" + voterid + ", address=" + address
				+ "]";
	}

}
