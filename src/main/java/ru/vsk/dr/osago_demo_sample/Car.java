package ru.vsk.dr.osago_demo_sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Car implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Тип транспортного средства для определения БТ")
	private java.lang.String osagoCarCategory;

	@org.kie.api.definition.type.Label("Используется ли в качестве такси")
	private boolean isTaxi;

	@org.kie.api.definition.type.Label("Макс. масса (тонн)")
	private double maxWeight;

	@org.kie.api.definition.type.Label("Кол-во пассажирских мест")
	private int passSeatsCount;

	@org.kie.api.definition.type.Label("мощность в л.с.")
	private int horsePower;

	@org.kie.api.definition.type.Label("Используется с прицепом")
	private boolean isUsingWithTrailer;

	@org.kie.api.definition.type.Label("Категория ТС по наличию регистрации в РФ")
	private java.lang.String registrationType;

	public Car() {
	}

	public java.lang.String getOsagoCarCategory() {
		return this.osagoCarCategory;
	}

	public void setOsagoCarCategory(java.lang.String osagoCarCategory) {
		this.osagoCarCategory = osagoCarCategory;
	}

	public boolean isIsTaxi() {
		return this.isTaxi;
	}

	public void setIsTaxi(boolean isTaxi) {
		this.isTaxi = isTaxi;
	}

	public double getMaxWeight() {
		return this.maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getPassSeatsCount() {
		return this.passSeatsCount;
	}

	public void setPassSeatsCount(int passSeatsCount) {
		this.passSeatsCount = passSeatsCount;
	}

	public int getHorsePower() {
		return this.horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public boolean isIsUsingWithTrailer() {
		return this.isUsingWithTrailer;
	}

	public void setIsUsingWithTrailer(boolean isUsingWithTrailer) {
		this.isUsingWithTrailer = isUsingWithTrailer;
	}

	public java.lang.String getRegistrationType() {
		return this.registrationType;
	}

	public void setRegistrationType(java.lang.String registrationType) {
		this.registrationType = registrationType;
	}

	public java.lang.String toString() {
		return "Car(" + "osagoCarCategory='" + osagoCarCategory + "' "
				+ "isTaxi='" + isTaxi + "' " + "maxWeight='" + maxWeight + "' "
				+ "passSeatsCount='" + passSeatsCount + "' " + "horsePower='"
				+ horsePower + "' " + "isUsingWithTrailer='"
				+ isUsingWithTrailer + "' " + "registrationType='"
				+ registrationType + "')";
	}

	public Car(java.lang.String osagoCarCategory, boolean isTaxi,
			double maxWeight, int passSeatsCount, int horsePower,
			boolean isUsingWithTrailer, java.lang.String registrationType) {
		this.osagoCarCategory = osagoCarCategory;
		this.isTaxi = isTaxi;
		this.maxWeight = maxWeight;
		this.passSeatsCount = passSeatsCount;
		this.horsePower = horsePower;
		this.isUsingWithTrailer = isUsingWithTrailer;
		this.registrationType = registrationType;
	}

}