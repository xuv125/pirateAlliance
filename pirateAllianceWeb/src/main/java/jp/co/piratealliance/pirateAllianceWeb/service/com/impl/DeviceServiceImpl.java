package jp.co.piratealliance.pirateAllianceWeb.service.com.impl;

import java.util.HashMap;
import java.util.Map;

import jp.co.piratealliance.pirateAllianceWeb.dao.com.DeviceDao;
import jp.co.piratealliance.pirateAllianceWeb.service.com.DeviceService;


/**
*
* copyright   pirate alliance team 2014
* @author     lunxing
*
*/

public class DeviceServiceImpl implements DeviceService {
	
	private DeviceDao deviceDao;

	public Boolean clearDeviceBadge(String device_token) {
		// TODO Auto-generated method stub
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("device_token", device_token);
		int rows = deviceDao.setBadgeZero(paramMap);
		Boolean result = false;
		if (rows > 0) {
			result = true;
		}
		return result;
	}

	/**
	 * @return the deviceDao
	 */
	public DeviceDao getDeviceDao() {
		return deviceDao;
	}

	/**
	 * @param deviceDao the deviceDao to set
	 */
	public void setDeviceDao(DeviceDao deviceDao) {
		this.deviceDao = deviceDao;
	}

}
