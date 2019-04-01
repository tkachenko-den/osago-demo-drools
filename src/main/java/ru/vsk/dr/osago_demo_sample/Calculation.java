package ru.vsk.dr.osago_demo_sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Calculation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("тариф от")
	private double minBaseTariff;
	@org.kie.api.definition.type.Label("тариф до")
	private double maxBaseTariff;

	@org.kie.api.definition.type.Label("базовый тариф")
	private double baseTariff;

	@org.kie.api.definition.type.Label("Коэффициент территории")
	private double koefTerr;

	@org.kie.api.definition.type.Label("Коэффициент бонус-малус")
	private double koefBonusMalus;

	@org.kie.api.definition.type.Label("Коэффициент ограничения круга водителей")
	private double koefLimitation;

	@org.kie.api.definition.type.Label("Коэффициент возраста стажа")
	private double koefAgeStage;

	@org.kie.api.definition.type.Label("Коэффициент мощности")
	private double koefPower;

	@org.kie.api.definition.type.Label("Коэффициент за прицеп")
	private double koefTrailer;

	@org.kie.api.definition.type.Label("Коэффициент за период использования")
	private double koefUsingPeriod;

	@org.kie.api.definition.type.Label("Коэффициент за срок страхования")
	private double koefInsTerm;

	@org.kie.api.definition.type.Label("Коэффициент за нарушения")
	private double koefViolation;

	@org.kie.api.definition.type.Label("Финальный тариф")
	private double finalTariff;

	@org.kie.api.definition.type.Label("формула рассчёта")
	private java.lang.String formula;

	@org.kie.api.definition.type.Label(value = "\u041C\u0430\u043A\u0441\u0438\u043C\u0430\u043B\u044C\u043D\u044B\u0439 \u0444\u0438\u043D\u0430\u043B\u044C\u043D\u044B\u0439 \u0442\u0430\u0440\u0438\u0444")
	private double maximumFinalTariff;

	public Calculation() {
	}

	public double getMinBaseTariff() {
		return this.minBaseTariff;
	}

	public void setMinBaseTariff(double minBaseTariff) {
		this.minBaseTariff = minBaseTariff;
	}

	public double getMaxBaseTariff() {
		return this.maxBaseTariff;
	}

	public void setMaxBaseTariff(double maxBaseTariff) {
		this.maxBaseTariff = maxBaseTariff;
	}

	public double getBaseTariff() {
		return this.baseTariff;
	}

	public void setBaseTariff(double baseTariff) {
		this.baseTariff = baseTariff;
	}

	public double getKoefTerr() {
		return this.koefTerr;
	}

	public void setKoefTerr(double koefTerr) {
		this.koefTerr = koefTerr;
	}

	public double getKoefBonusMalus() {
		return this.koefBonusMalus;
	}

	public void setKoefBonusMalus(double koefBonusMalus) {
		this.koefBonusMalus = koefBonusMalus;
	}

	public double getKoefLimitation() {
		return this.koefLimitation;
	}

	public void setKoefLimitation(double koefLimitation) {
		this.koefLimitation = koefLimitation;
	}

	public double getKoefAgeStage() {
		return this.koefAgeStage;
	}

	public void setKoefAgeStage(double koefAgeStage) {
		this.koefAgeStage = koefAgeStage;
	}

	public double getKoefPower() {
		return this.koefPower;
	}

	public void setKoefPower(double koefPower) {
		this.koefPower = koefPower;
	}

	public double getKoefTrailer() {
		return this.koefTrailer;
	}

	public void setKoefTrailer(double koefTrailer) {
		this.koefTrailer = koefTrailer;
	}

	public double getKoefUsingPeriod() {
		return this.koefUsingPeriod;
	}

	public void setKoefUsingPeriod(double koefUsingPeriod) {
		this.koefUsingPeriod = koefUsingPeriod;
	}

	public double getKoefInsTerm() {
		return this.koefInsTerm;
	}

	public void setKoefInsTerm(double koefInsTerm) {
		this.koefInsTerm = koefInsTerm;
	}

	public double getKoefViolation() {
		return this.koefViolation;
	}

	public void setKoefViolation(double koefViolation) {
		this.koefViolation = koefViolation;
	}

	public double getFinalTariff() {
		return this.finalTariff;
	}

	public void setFinalTariff(double finalTariff) {
		this.finalTariff = finalTariff;
	}

	public java.lang.String getFormula() {
		return this.formula;
	}

	public void setFormula(java.lang.String formula) {
		this.formula = formula;
	}

	public double getMaximumFinalTariff() {
		return this.maximumFinalTariff;
	}

	public void setMaximumFinalTariff(double maximumFinalTariff) {
		this.maximumFinalTariff = maximumFinalTariff;
	}

	public Calculation(double minBaseTariff, double maxBaseTariff,
			double baseTariff, double koefTerr, double koefBonusMalus,
			double koefLimitation, double koefAgeStage, double koefPower,
			double koefTrailer, double koefUsingPeriod, double koefInsTerm,
			double koefViolation, double finalTariff, java.lang.String formula,
			double maximumFinalTariff) {
		this.minBaseTariff = minBaseTariff;
		this.maxBaseTariff = maxBaseTariff;
		this.baseTariff = baseTariff;
		this.koefTerr = koefTerr;
		this.koefBonusMalus = koefBonusMalus;
		this.koefLimitation = koefLimitation;
		this.koefAgeStage = koefAgeStage;
		this.koefPower = koefPower;
		this.koefTrailer = koefTrailer;
		this.koefUsingPeriod = koefUsingPeriod;
		this.koefInsTerm = koefInsTerm;
		this.koefViolation = koefViolation;
		this.finalTariff = finalTariff;
		this.formula = formula;
		this.maximumFinalTariff = maximumFinalTariff;
	}
	
	public java.lang.String toString(){
	    return "Calculation("+
	    "minBaseTariff='"+minBaseTariff+"' "+
		"maxBaseTariff='"+maxBaseTariff+"' "+
		"baseTariff='"+baseTariff+"' "+
		"koefTerr='"+koefTerr+"' "+
		"koefBonusMalus='"+koefBonusMalus+"' "+
		"koefLimitation='"+koefLimitation+"' "+
		"koefAgeStage='"+koefAgeStage+"' "+
		"koefPower='"+koefPower+"' "+
		"koefTrailer='"+koefTrailer+"' "+
		"koefUsingPeriod='"+koefUsingPeriod+"' "+
		"koefInsTerm='"+koefInsTerm+"' "+
		"koefViolation='"+koefViolation+"' "+
		"finalTariff='"+finalTariff+"' "+
		"formula='"+formula+"' "+
		"maximumFinalTariff='"+maximumFinalTariff+"')";
	}

}