package com.sm.Utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Mahdi on 05/06/2017.
 */


@Component
@Scope(value = "singleton")
public class SessionBean {
    private boolean connected = false;

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
}
