package jp.co.piratealliance.pirateAllianceWeb.service.com;


/**
*
* copyright   pirate alliance team 2014
* @author     lunxing
*
*/
public interface DeviceService {

	Boolean clearDeviceBadge(String device_token);
	
	Boolean badgeAddOne(String device_token);
}
