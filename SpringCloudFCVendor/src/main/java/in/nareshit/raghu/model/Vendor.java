package in.nareshit.raghu.model;


public class Vendor {

	private Integer vid;
	private String vname;
	private String vloc;
	
	
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(Integer vid, String vname, String vloc) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vloc = vloc;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVloc() {
		return vloc;
	}
	public void setVloc(String vloc) {
		this.vloc = vloc;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", vloc=" + vloc + "]";
	}

	
}