package be.project.pojo;

import java.io.Serializable;
import java.util.Objects;

public abstract class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3718811560109659113L;
	private String name;
	private String password;
	private String matricule;
	private String firstName;
	private int idUser;
	
	public Users() {}
	public Users(int id,String name, String password, String matricule, String firstName) {
		
		this.idUser=id;
		this.name = name;
		this.password = password;
		this.matricule = matricule;
		this.firstName = firstName;
	}
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, idUser, matricule, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(firstName, other.firstName) && idUser == other.idUser
				&& Objects.equals(matricule, other.matricule) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", matricule=" + matricule + ", firstName="
				+ firstName + ", idUser=" + idUser + "]";
	}
	
	
	
	
}
