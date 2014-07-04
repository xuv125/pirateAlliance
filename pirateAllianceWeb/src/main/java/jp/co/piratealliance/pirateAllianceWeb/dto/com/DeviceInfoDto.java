package jp.co.piratealliance.pirateAllianceWeb.dto.com;

/**
 * copyright   pirate alliance team 2014
 * @author     lunxing
 */

public class DeviceInfoDto {

	private String device_token;
	
	private String user_id;

	private int badge;

	/**
	 * @return the device_token
	 */
	public String getDevice_token() {
		return device_token;
	}

	/**
	 * @param device_token the device_token to set
	 */
	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}

	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the badge
	 */
	public int getBadge() {
		return badge;
	}

	/**
	 * @param badge the badge to set
	 */
	public void setBadge(int badge) {
		this.badge = badge;
	}

}
