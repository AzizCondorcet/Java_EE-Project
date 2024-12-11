package be.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Site implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7427342660042435486L;
	
	private List<Zone> zones;
	private List<Machine> machines;
	private List<Workers> workers;
	private List<MaintenanceManager> maintenanceManagers;
	private String city;
	private int idSite;
	public Site(List<Zone> z, String city,int id) {
		super();
		this.zones = z;
		this.machines = new ArrayList<>();
		this.workers = new ArrayList<>();
		this.maintenanceManagers = new ArrayList<>();
		this.city = city;
		this.idSite=id;
	}
	public Site() {
		super();
		// TODO Auto-generated constructor stub
		this.machines = new ArrayList<>();
		this.workers = new ArrayList<>();
		this.maintenanceManagers = new ArrayList<>();
		this.zones = new ArrayList<>();
	}
	
	public int getIdSite() {
		return idSite;
	}
	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}
	public List<Zone> getZones() {
		return zones;
	}
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	public List<Machine> getMachines() {
		return machines;
	}
	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}
	public List<Workers> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Workers> workers) {
		this.workers = workers;
	}
	public List<MaintenanceManager> getMaintenanceManagers() {
		return maintenanceManagers;
	}
	public void setMaintenanceManagers(List<MaintenanceManager> maintenanceManagers) {
		this.maintenanceManagers = maintenanceManagers;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void addMachine(Machine m) throws Exception {
    	if(m!=null && !machines.contains(m)) {
    		machines.add(m);
    	}else{
    		throw new Exception("error add machine");
    	}
    }
	public void addZone(Zone z) throws Exception {
    	if(z!=null && !zones.contains(z)) {
    		zones.add(z);
    	}else{
    		throw new Exception("error add zone");
    	}
    }
	public void addMaintenanceManagers(MaintenanceManager m) throws Exception {
    	if(m!=null && !maintenanceManagers.contains(m)) {
    		maintenanceManagers.add(m);
    	}else{
    		throw new Exception("error add maintenance manager");
    	}
    }
	public void addWorker(Workers w) throws Exception {
    	if(w!=null && !workers.contains(w)) {
    		workers.add(w);
    	}else{
    		throw new Exception("error add worker");
    	}
    }
	@Override
	public String toString() {
		return "Site [zones=" + zones + ", machines=" + machines + ", workers=" + workers + ", maintenanceManagers="
				+ maintenanceManagers + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, machines, maintenanceManagers, workers, zones);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Site other = (Site) obj;
		return Objects.equals(city, other.city) && Objects.equals(machines, other.machines)
				&& Objects.equals(maintenanceManagers, other.maintenanceManagers)
				&& Objects.equals(workers, other.workers) && Objects.equals(zones, other.zones);
	}
	
	
	
	
	

	
}
