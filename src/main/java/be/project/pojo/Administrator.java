package be.project.pojo;

import java.io.Serializable;

public class Administrator extends Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4978815461997604986L;

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(int id, String name, String password, String matricule, String firstName) {
		super(id, name, password, matricule, firstName);
		// TODO Auto-generated constructor stub
	}

	
}
