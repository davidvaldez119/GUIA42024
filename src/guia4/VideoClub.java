package guia4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enums.Genre;

public class VideoClub {

    private List<Client> arrayClients = new ArrayList<Client>();

    private List<Film> arrayFilm = new ArrayList<Film>();


//
//	public VideoClub(Genre gender, String tytle, Integer ncopy, Date relateDate, Double duration, String clasification,
//					 String name, Integer tel, Film[] rent) {
//	super(gender, tytle, ncopy, relateDate, duration, clasification, name, tel, rent);
//}
//
//public VideoClub(Genre gender, String tytle, Integer ncopy, Date relateDate, Double duration, String clasification,
//		String name, Integer tel, Film[] rent, List<Client> arrayClients, List<Film> arrayFilm) {
//	super(gender, tytle, ncopy, relateDate, duration, clasification, name, tel, rent);
//	this.arrayClients = arrayClients;
//	this.arrayFilm = arrayFilm;
//}


    public VideoClub() {
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
//	int i=0;
//	 VideoClub.this.arrayClients.add(i, c);
//	 i++;
        arrayClients.add(c);
    }

    public void recorrerArrayCliente() {
        for (Client c : arrayClients) {
            System.out.println(c);
        }


    }

    public  void recorrerLambda(){
        arrayClients.forEach(System.out::println);
    }



    public Client estaPresente(String name) {
        Client client = null;
        for (Client c : arrayClients) {
            if (c.getName().equals(name)) {
                client = c;
            }
        }
        return client;
    }
    public void altaFilm(Film f){
       arrayFilm.add(f);

    }

    public Film buscaFilm(Film f){

        for (Film film:arrayFilm) {
         if()
        }

    }
}
