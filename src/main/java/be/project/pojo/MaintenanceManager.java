package be.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MaintenanceManager extends Users implements Serializable {

    private static final long serialVersionUID = -4423825030796416630L;

    private List<Maintenance> maintenances;
    private Site site;

    public MaintenanceManager() {
        super();
        this.maintenances = new ArrayList<>();
    }

    public MaintenanceManager(int id, String name, String password, String matricule, String firstName, Site s) {
        super(id, name, password, matricule, firstName);
        this.site = s;
        this.maintenances = new ArrayList<>(); 
    }

    
    public List<Maintenance> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(List<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
    public void addMaintenance(Maintenance m) throws Exception {
    	if(m!=null && !maintenances.contains(m)) {
    		maintenances.add(m);
    	}else{
    		throw new Exception("error add maintenance");
    	}
    }

	@Override
	public String toString() {
		return "MaintenanceManager [maintenances=" + maintenances + ", site=" + site + "]";
	}
    
    
}
