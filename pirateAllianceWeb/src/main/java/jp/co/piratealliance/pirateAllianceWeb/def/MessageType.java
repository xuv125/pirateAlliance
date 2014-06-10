package jp.co.piratealliance.pirateAllianceWeb.def;

/**
 *
 * copyright   pirate alliance team 2014
 * @author     xuwei
 *
 */
public enum MessageType {
    /** I:情報. */
    INFO("I"),
    /** W:警告. */
    WARN("W"),
    /** E:エラー. */
    ERROR("E"),
    /** F:致命的. */
    FATAL("F");

    /** メッセージタイプ短縮名.*/
    private String shortName;

    /**
     * コンストラクタ.
     * @param prmShortName 短縮名
     */
    private MessageType(final String prmShortName) {
        shortName = prmShortName;
    }

    /**
     * メッセージタイプ短縮名を取得します.
     * @return 短縮名
     */
    public String getShortName() {
        return shortName;
    }
}
