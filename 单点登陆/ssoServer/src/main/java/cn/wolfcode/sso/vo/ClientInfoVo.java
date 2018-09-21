package cn.wolfcode.sso.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wolfcode-lanxw
 */
@Setter@Getter
public class ClientInfoVo {
    private String clientUrl;
    private String jsessionid;

    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public String getClientUrl() {
        return clientUrl;
    }

    public String getJsessionid() {
        return jsessionid;
    }
}
