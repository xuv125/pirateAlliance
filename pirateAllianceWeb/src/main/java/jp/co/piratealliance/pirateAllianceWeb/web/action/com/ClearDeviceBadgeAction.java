package jp.co.piratealliance.pirateAllianceWeb.web.action.com;

import jp.co.piratealliance.pirateAllianceWeb.common.base.BaseAction;
import jp.co.piratealliance.pirateAllianceWeb.service.com.DeviceService;



/**
 * copyright pirate alliance team 2014
 *
 * @author lunxing
 */

public class ClearDeviceBadgeAction extends BaseAction {
	private DeviceService deviceService;
	
	private Boolean result;
	
	private String device_token;

	public String clearDeviceBadge()
	{
		result = deviceService.clearDeviceBadge(this.device_token);
		return SUCCESS;
	}

	/**
	 * @return the deviceService
	 */
	public DeviceService getDeviceService() {
		return deviceService;
	}

	/**
	 * @param deviceService the deviceService to set
	 */
	public void setDeviceService(DeviceService deviceService) {
		this.deviceService = deviceService;
	}

	/**
	 * @return the result
	 */
	public Boolean getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(Boolean result) {
		this.result = result;
	}

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

}
