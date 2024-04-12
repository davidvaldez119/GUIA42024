package guia4;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import Enums.Genre;

public class Client {
	

	private String name;//nombre
	
	private Integer tel;//telefono
	
	private Film rent[];//alquiler
	
	

	

	public Client(Genre gender, String tytle, Integer ncopy, Date relateDate, Double duration, String clasification,
			String name, Integer tel, Film[] rent) {
		
		this.name = name;
		this.tel = tel;
		this.rent = rent;
	}

	

	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public Film[] getRent() {
		return rent;
	}

	public void setRent(Film[] rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", tel=" + tel + ", rent=" + Arrays.toString(rent) + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Client client = (Client) o;
		return Objects.equals(name, client.name) && Objects.equals(tel, client.tel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, tel);
	}
}
