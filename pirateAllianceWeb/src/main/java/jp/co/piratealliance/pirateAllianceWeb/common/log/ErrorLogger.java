package jp.co.piratealliance.pirateAllianceWeb.common.log;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import jp.co.piratealliance.pirateAllianceWeb.common.util.RequestDumpUtil;
import jp.co.piratealliance.pirateAllianceWeb.def.Constants;
import jp.co.piratealliance.pirateAllianceWeb.def.MessageCode;
import jp.co.piratealliance.pirateAllianceWeb.def.MessageType;
import jp.co.piratealliance.pirateAllianceWeb.helper.WebHelper;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

/**
 * copyright pirate alliance team 2014
 *
 * @author xuwei
 *
 */
public final class ErrorLogger
{
	/** ロガー. */
	private static Logger log;
	/** インデント. */
	private static final String INDENT = "  ";
	/** 改行. */
	private static final String LF = System.getProperty("line.separator");

	/**
	 * 初期化.
	 */
	static
	{
		// ロガーを初期化
		log = Logger.getLogger(Constants.LOG_PACKAGE_ERROR_DETAIL);
	}

	/**
	 * インスタンス化禁止.
	 */
	private ErrorLogger()
	{
	}

	/**
	 * 障害ログ及び障害詳細ログを出力します.
	 *
	 * @param ex
	 *            対象例外
	 * @param messageCode
	 *            MessageCode
	 * @param entryClassName
	 *            発生エントリーポイントクラス名
	 * @param message
	 *            メッセージ
	 */
	public static void log(final Throwable ex, final MessageCode messageCode,
			final String entryClassName, final String message)
	{
		if (ex != null)
		{
			String errorLogMsg = buildMessage(ex, messageCode, entryClassName,
					message);
			log.error(errorLogMsg);
		}
	}

	/**
	 * 障害ログ及び障害詳細ログを出力します.
	 *
	 * @param ex
	 *            対象例外
	 * @param messageCode
	 *            MessageCode
	 * @param entryClassName
	 *            発生エントリーポイントクラス名
	 * @param message
	 *            メッセージ
	 */
	public static void warnLog(final Throwable ex,
			final MessageCode messageCode, final String entryClassName,
			final String message)
	{
		if (ex != null)
		{
			String errorLogMsg = buildMessage(ex, messageCode, entryClassName,
					message);
			log.warn(errorLogMsg);
		}
	}

	/**
	 * 障害ログメッセージを生成します.
	 *
	 * @param ex
	 *            対象例外
	 * @param messageCode
	 *            MessageCode
	 * @param entryClassName
	 *            発生エントリーポイントクラス名
	 * @param message
	 *            メッセージ
	 * @return 障害ログメッセージ
	 */
	private static String buildMessage(final Throwable ex,
			final MessageCode messageCode, final String entryClassName,
			final String message)
	{

		String exceptionName = ex.getClass().getName();
		String dump = getDump();
		MessageType type     = messageCode.getType();
        String code          = messageCode.getCode();

		return type.getShortName() + Constants.LOG_ITEM_DELIMITER + code
				+ Constants.LOG_ITEM_DELIMITER + exceptionName
				+ Constants.LOG_ITEM_DELIMITER + entryClassName
				+ Constants.LOG_ITEM_DELIMITER + message
				+ Constants.LOG_ITEM_DELIMITER + getStackTraceMessage(ex)
				+ Constants.LOG_ITEM_DELIMITER + dump;
	}

	/**
	 * スタックトレースメッセージを取得します.
	 *
	 * @param ex
	 *            対象例外
	 * @return スタックトレースメッセージ
	 */
	private static String getStackTraceMessage(final Throwable ex)
	{
		if (ex == null)
		{
			return "";
		}

		StringWriter str = new StringWriter();
		PrintWriter writer = new PrintWriter(str, true);
		ex.printStackTrace(writer);

		return str.toString();
	}

	/**
	 * ダンプを取得します.
	 *
	 * @return ダンプ情報
	 */
	private static String getDump()
	{
		StringBuilder sb = new StringBuilder();
		if (ServletActionContext.getContext() != null)
		{
			HttpServletRequest request = WebHelper.getRequest();
			ServletContext context = ServletActionContext.getServletContext();
			RequestDumpUtil.dumpContextAttributes(sb, context, LF, INDENT);
			RequestDumpUtil.dumpRequestAttributes(sb, request, LF, INDENT);
			RequestDumpUtil.dumpCookies(sb, request, LF, INDENT);
			RequestDumpUtil.dumpRequestHeaders(sb, request, LF, INDENT);
			RequestDumpUtil.dumpSessionAttributes(sb, request, LF, INDENT);
		}
		return sb.toString();

	}
}
