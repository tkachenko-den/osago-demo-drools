package ru.vsk.dr.osago_demo_sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OsagoPolicy implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Период использования в месяцах")
	private int usingPeriod;

	@org.kie.api.definition.type.Label("Неограниченный круг водителей")
	private boolean isUnlimitedDrivers;

	@org.kie.api.definition.type.Label("применить коэффициент за нарушения")
	private boolean isApplyViolationKoef;

	@org.kie.api.definition.type.Label(value = "\u0441\u0440\u043E\u043A \u0441\u0442\u0440\u0430\u0445\u043E\u0432\u0430\u043D\u0438\u044F (\u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u044F)")
	private java.lang.String insDuration;

	public OsagoPolicy() {
	}

	public int getUsingPeriod() {
		return this.usingPeriod;
	}

	public void setUsingPeriod(int usingPeriod) {
		this.usingPeriod = usingPeriod;
	}

	public boolean isIsUnlimitedDrivers() {
		return this.isUnlimitedDrivers;
	}

	public void setIsUnlimitedDrivers(boolean isUnlimitedDrivers) {
		this.isUnlimitedDrivers = isUnlimitedDrivers;
	}

	public boolean isIsApplyViolationKoef() {
		return this.isApplyViolationKoef;
	}

	public void setIsApplyViolationKoef(boolean isApplyViolationKoef) {
		this.isApplyViolationKoef = isApplyViolationKoef;
	}

	public java.lang.String getInsDuration() {
		return this.insDuration;
	}

	public void setInsDuration(java.lang.String insDuration) {
		this.insDuration = insDuration;
	}

	public OsagoPolicy(int usingPeriod, boolean isUnlimitedDrivers,
			boolean isApplyViolationKoef, java.lang.String insDuration) {
		this.usingPeriod = usingPeriod;
		this.isUnlimitedDrivers = isUnlimitedDrivers;
		this.isApplyViolationKoef = isApplyViolationKoef;
		this.insDuration = insDuration;
	}
	
	public java.lang.String toString(){
	    return "OsagoPolicy("+
	        "usingPeriod='"+ usingPeriod+"' "+
		    "isUnlimitedDrivers='"+isUnlimitedDrivers+"' "+
		    "isApplyViolationKoef='"+ isApplyViolationKoef+"' "+
		    "insDuration='"+ insDuration+"')";
	}

}