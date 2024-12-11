package be.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import be.project.enums.MachineType;
import be.project.enums.MaintenanceStatus;

public class Machine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6925743645000772497L;
	
	private MaintenanceStatus status;
	private MachineType typeMachine;
	private Site site;
	private List<Zone> zones;
	private List<Maintenance> maintenances;
	private int idMaintenance;
	
	
	public Machine() {
		super();
		// TODO Auto-generated constructor stub
		this.maintenances = new ArrayList<>();
	}


	public Machine(MaintenanceStatus status, MachineType typeMachine, Site site, List<Zone> zones,
			int id
			
			) throws Exception {
		super();
		this.status = status;
		this.typeMachine = typeMachine;
		this.site = site;
		this.zones = zones;
		this.maintenances = new ArrayList<>();
		this.idMaintenance=id;
		
	}
	
	public void addMaintenance(Maintenance m) throws Exception {
    	if(m!=null && !maintenances.contains(m)) {
    		maintenances.add(m);
    	}else{
    		throw new Exception("error add maintenance");
    	}
    }


	public MaintenanceStatus getStatus() {
		return status;
	}


	public void setStatus(MaintenanceStatus status) {
		this.status = status;
	}


	
	public int getIdMaintenance() {
		return idMaintenance;
	}


	public void setIdMaintenance(int idMaintenance) {
		this.idMaintenance = idMaintenance;
	}


	public MachineType getTypeMachine() {
		return typeMachine;
	}


	public void setTypeMachine(MachineType typeMachine) {
		this.typeMachine = typeMachine;
	}


	public Site getSite() {
		return site;
	}


	public void setSite(Site site) {
		this.site = site;
	}


	public List<Zone> getZones() {
		return zones;
	}


	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}


	public List<Maintenance> getMaintenances() {
		return maintenances;
	}


	public void setMaintenances(List<Maintenance> maintenances) {
		this.maintenances = maintenances;
	}


	@Override
	public String toString() {
		return "Machine [status=" + status + ", typeMachine=" + typeMachine + ", site=" + site + ", zones=" + zones
				+ ", maintenances=" + maintenances + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idMaintenance, maintenances, site, status, typeMachine, zones);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		return idMaintenance == other.idMaintenance && Objects.equals(maintenances, other.maintenances)
				&& Objects.equals(site, other.site) && status == other.status && typeMachine == other.typeMachine
				&& Objects.equals(zones, other.zones);
	}
	
	
	
	

	
}
