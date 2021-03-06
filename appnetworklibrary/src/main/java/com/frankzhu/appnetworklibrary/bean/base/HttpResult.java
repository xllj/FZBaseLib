package com.frankzhu.appnetworklibrary.bean.base;

import com.frankzhu.appbaselibrary.utils.FZStringHelper;
import com.frankzhu.appnetworklibrary.api.AppApiContact;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      16/4/29 下午6:36
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 16/4/29      ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class HttpResult<T> extends Meta {
    public T data;
    public Page page;

    public boolean isSuccess() {
        return errno == AppApiContact.STATUS_NET_SUCCESS;
    }

    public String getMsg() {
        return FZStringHelper.isEmpty(msg) ? "" : msg;
    }

    public int getErrorCode() {
        return errno;
    }

    public T getData() {
        return data;
    }
}
