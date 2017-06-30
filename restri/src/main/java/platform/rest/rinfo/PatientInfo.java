package platform.rest.rinfo;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import java.sql.Timestamp;

@Entity
@Table( name = "viri_patient_all")     
public class PatientInfo {
    @Id
    private long case_history_id;
	private long registry_id;
	private String show_id;
    private String show_fullname;
    private String tempr_m;
	private Timestamp date_in;
	private Timestamp date_out;
    private String division_name;
    private String ward_name;
    private String doctor_name;
    private String sost;
    private Timestamp dataoperation;
    private String pass_type_name;

    public void setcase_history_id(long id) {
        this.case_history_id = id;
    }

    public long getcase_history_id() {
        return case_history_id;
    }

    public long getregistry_id() {
        return registry_id;
    }

    public String getshow_id() {
        return show_id;
    }

    public String getshow_fullname() {
        return show_fullname;
    }

    public String gettempr_m() {
        return tempr_m;
    }

    public Timestamp getdate_in() {
        return date_in;
    }
	
    public String getdivision_name() {
        return division_name;
    }
	
    public String getward_name() {
        return ward_name;
    }
	
    public String getdoctor_name() {
        return doctor_name;
    }
	
    public String getsost() {
        return sost;
    }
	
}
