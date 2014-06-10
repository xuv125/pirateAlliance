package jp.co.piratealliance.pirateAllianceWeb.web.interceptor;

import jp.co.piratealliance.pirateAllianceWeb.common.log.ErrorLogger;
import jp.co.piratealliance.pirateAllianceWeb.common.log.OperationLogger;
import jp.co.piratealliance.pirateAllianceWeb.def.MessageCode;
import jp.co.piratealliance.pirateAllianceWeb.def.MessageCodeConstants;
import jp.co.piratealliance.pirateAllianceWeb.def.MessageType;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 系统拦截器 copyright pirate alliance team 2014
 *
 * @author xuwei
 *
 */
public class SysInterceptor extends AbstractInterceptor
{

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception
	{
		String result = null;
		// イベント開始タイミング
	    long startTime = System.currentTimeMillis();
	    // 実行さんるクラス名
		String entryClassName = actionInvocation.getProxy().getActionName();
		try
		{
			result = actionInvocation.invoke();

		}
		catch (Throwable ex)
		{
			String message = "";
			MessageCode mc = new MessageCode(MessageCodeConstants.E_00000001, MessageType.ERROR);

			// エラーログ設定
			ErrorLogger.log(ex, mc, entryClassName, message);

			result = "atomSysError";
		}
		finally
		{
			// 操作ログ設定
			long endTime = System.currentTimeMillis();

			OperationLogger.log(actionInvocation, "", startTime, endTime);
		}
		return result;
	}

}
