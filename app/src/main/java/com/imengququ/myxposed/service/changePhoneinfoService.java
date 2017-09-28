package com.imengququ.myxposed.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class changePhoneinfoService extends Service {
    public changePhoneinfoService() {
        changePhoneinfoService  ser = new changePhoneinfoService();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

     }
}
