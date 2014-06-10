package jp.co.piratealliance.pirateAllianceWeb.def;
import java.io.Serializable;

/**
 *
 * copyright   pirate alliance team 2014
 * @author     xuwei
 *
 */
public class MessageCode implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /** メッセージコード. */
    private final String code;
    /** メッセージ種別. */
    private final MessageType type;

    /**
     * コンストラクタ.
     * @param messageCode メッセージコード
     * @param messageType メッセージ種別
     */
    public MessageCode(final String messageCode,
                          final MessageType messageType) {
        code = messageCode;
        type = messageType;
    }

    /**
     * メッセージコードを取得します.
     * @return メッセージコード
     */
    public final String getCode() {
        return code;
    }

    /**
     * メッセージ種別を取得します.
     * @return メッセージ種別
     */
    public final MessageType getType() {
        return type;
    }
}
