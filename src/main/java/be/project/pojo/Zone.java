package be.project.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import be.project.enums.ColorCode;

public class Zone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2261047184029960856L;
	private ColorCode code;
	private String letter;
	private List<Machine> machines;
	private Site site;
	private int idZone;
	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zone(ColorCode code, String letter, Site site,int id) {
		super();
		this.code = code;
		this.letter = letter;
		this.machines = new ArrayList<>();
		this.site = site;
		this.idZone=id;
	}
	
	public int getIdZone() {
		return idZone;
	}
	public void setIdZone(int idZone) {
		this.idZone = idZone;
	}
	public ColorCode getCode() {
		return code;
	}
	public void setCode(ColorCode code) {
		this.code = code;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public List<Machine> getMachines() {
		return machines;
	}
	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	@Override
	public String toString() {
		return "Zone [code=" + code + ", letter=" + letter + ", machines=" + machines + ", site=" + site + "]";
	}
	public void addMachine(Machine m) throws Exception {
    	if(m!=null && !machines.contains(m)) {
    		machines.add(m);
    	}else{
    		throw new Exception("error add machine");
    	}
    }
	
	
	
	
	
	
}
