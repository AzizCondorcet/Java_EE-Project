package be.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Workers extends Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7287762536529635915L;

	private Site site;
	private List<Maintenance> maintenances;
	public Workers() {
		super();
		// TODO Auto-generated constructor stub
		this.maintenances = new ArrayList<>();
	}

	public Workers(int id, String name, String password, String matricule, String firstName,Site s) {
		super(id, name, password, matricule, firstName);
		// TODO Auto-generated constructor stub
		this.site = s;
        this.maintenances = new ArrayList<>(); 
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Maintenance> getMaintenances() {
		return maintenances;
	}

	public void setMaintenances(List<Maintenance> maintenances) {
		this.maintenances = maintenances;
	}

	@Override
	public String toString() {
		return "Workers [site=" + site + ", maintenances=" + maintenances + "]";
	}
	public void addMaintenance(Maintenance m) throws Exception {
    	if(m!=null && !maintenances.contains(m)) {
    		maintenances.add(m);
    	}else{
    		throw new Exception("error add maintenance");
    	}
    }

	
}
