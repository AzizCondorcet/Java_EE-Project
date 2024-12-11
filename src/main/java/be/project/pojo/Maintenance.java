package be.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import be.project.enums.MaintenanceStatus;

public class Maintenance implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7739924453001301098L;
	
	private MaintenanceStatus status;
	private Date date;
	private String rapport;
	private int duration;
	private MaintenanceManager manager;
	private List<Workers> workers;
	private Machine machine;
	private int idMaintenance;
	public Maintenance() {
		super();
		// TODO Auto-generated constructor stub
		this.workers = new ArrayList<>();
	}
	public Maintenance(MaintenanceStatus status, Date date, String rapport, int duration, MaintenanceManager manager,
			List<Workers> workers, Machine machine, int idMaintenance) {
		super();
		this.status = status;
		this.date = date;
		this.rapport = rapport;
		this.duration = duration;
		this.manager = manager;
		this.workers = workers;
		this.machine = machine;
		this.idMaintenance = idMaintenance;
	}
	public MaintenanceStatus getStatus() {
		return status;
	}
	public void setStatus(MaintenanceStatus status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRapport() {
		return rapport;
	}
	public void setRapport(String rapport) {
		this.rapport = rapport;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public MaintenanceManager getManager() {
		return manager;
	}
	public void setManager(MaintenanceManager manager) {
		this.manager = manager;
	}
	public List<Workers> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Workers> workers) {
		this.workers = workers;
	}
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	public int getIdMaintenance() {
		return idMaintenance;
	}
	public void setIdMaintenance(int idMaintenance) {
		this.idMaintenance = idMaintenance;
	}
	@Override
	public String toString() {
		return "Maintenance [status=" + status + ", date=" + date + ", rapport=" + rapport + ", duration=" + duration
				+ ", manager=" + manager + ", workers=" + workers + ", machine=" + machine + ", idMaintenance="
				+ idMaintenance + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, duration, idMaintenance, machine, manager, rapport, status, workers);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maintenance other = (Maintenance) obj;
		return Objects.equals(date, other.date) && duration == other.duration && idMaintenance == other.idMaintenance
				&& Objects.equals(machine, other.machine) && Objects.equals(manager, other.manager)
				&& Objects.equals(rapport, other.rapport) && status == other.status
				&& Objects.equals(workers, other.workers);
	}
	
	
	
	
	

	
}
