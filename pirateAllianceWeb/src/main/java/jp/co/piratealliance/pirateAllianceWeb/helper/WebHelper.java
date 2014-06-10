package jp.co.piratealliance.pirateAllianceWeb.helper;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

/**
 * copyright   pirate alliance team 2014
 * @author     xuwei
 *
 */
public final class WebHelper
{
	/**
	 * HttpServletRequest取得
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request;
	}
}
