package guia4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enums.Genre;

public class VideoClub extends  Client{
	
private List<Client> arrayClients=new ArrayList<Client> ();

private List<Film> arrayFilm=new ArrayList<Film>();






public VideoClub(Genre gender, String tytle, Integer ncopy, Date relateDate, Double duration, String clasification,
		String name, Integer tel, Film[] rent) {
	super(gender, tytle, ncopy, relateDate, duration, clasification, name, tel, rent);
}

public VideoClub(Genre gender, String tytle, Integer ncopy, Date relateDate, Double duration, String clasification,
		String name, Integer tel, Film[] rent, List<Client> arrayClients, List<Film> arrayFilm) {
	super(gender, tytle, ncopy, relateDate, duration, clasification, name, tel, rent);
	this.arrayClients = arrayClients;
	this.arrayFilm = arrayFilm;
}

public List<Client> getArrayClients() {
	return arrayClients;
}

public void setArrayClients(List<Client> arrayClients) {
	this.arrayClients = arrayClients;
}

public List<Film> getArrayFilm() {
	return arrayFilm;
}

public void setArrayFilm(List<Film> arrayFilm) {
	this.arrayFilm = arrayFilm;
}


@Override
public String toString() {
	return "VideoClub [arrayClients=" + arrayClients + ", arrayFilm=" + arrayFilm + "]";
}

public void alta(Client c) {
	int i=0;
	 VideoClub.this.arrayClients.add(i, c);
	 i++;
}

	

}
