package com.sm.Profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Mahdi on 09/06/2017.
 */

@Component
@Profile("dev")
public class Dev implements Env {

    @Override
    public String getEnv() {
        return "dev";
    }
}
