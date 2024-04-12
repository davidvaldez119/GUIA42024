package guia4;

import java.util.Date;

import Enums.Genre;

public class Film {
	private Genre gender; //genero
	private String tytle; //titulo
	private Integer Ncopy;//numero de copias
	private Date relateDate;//fecha de lanzamiento
	private Double duration; //duracion
	private String Clasification;//clasificacion


	public Film() {
	}

	public Film(Genre gender, String tytle, Integer ncopy, Date relateDate, Double duration, String clasification) {
		
		this.gender = gender;
		this.tytle = tytle;
		Ncopy = ncopy;
		this.relateDate = relateDate;
		this.duration = duration;
		Clasification = clasification;
	}
	public Genre getGender() {
		return gender;
	}
	public void setGender(Genre gender) {
		this.gender = gender;
	}
	public String getTytle() {
		return tytle;
	}
	public void setTytle(String tytle) {
		this.tytle = tytle;
	}
	public Integer getNcopy() {
		return Ncopy;
	}
	public void setNcopy(Integer ncopy) {
		Ncopy = ncopy;
	}
	public Date getRelateDate() {
		return relateDate;
	}
	public void setRelateDate(Date relateDate) {
		this.relateDate = relateDate;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public String getClasification() {
		return Clasification;
	}
	public void setClasification(String clasification) {
		Clasification = clasification;
	}
	@Override
	public String toString() {
		return "Film [gender=" + gender + ", tytle=" + tytle + ", Ncopy=" + Ncopy + ", relateDate=" + relateDate
				+ ", duration=" + duration + ", Clasification=" + Clasification + "]";
	}
	
	

}
