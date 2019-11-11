
public class Auto {

	private String autoMarka;
	private String autoTipus;
	private int ccm;

	public Auto(String autoMarka, String autoTipus, int ccm) {
		this.autoMarka = autoMarka;
		this.autoTipus = autoTipus;
		this.ccm = ccm;
	}

	public String getAutoMarka() {
		return autoMarka;
	}

	public void setAutoMarka(String autoMarka) {
		this.autoMarka = autoMarka;
	}

	public String getAutoTipus() {
		return autoTipus;
	}

	public void setAutoTipus(String autoTipus) {
		this.autoTipus = autoTipus;
	}

	public int getCcm() {
		return ccm;
	}

	public void setCcm(int ccm) {
		this.ccm = ccm;
	}

	@Override
	public String toString() {
		return "Auto [autoMarka=" + autoMarka + ", autoTipus=" + autoTipus + ", ccm=" + ccm + "]";
	}

}
