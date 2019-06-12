package com.example.conponent_1;

import android.content.Intent;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.CCUtil;
import com.billy.cc.core.component.IComponent;

public class Conponent_1 implements IComponent {
    @Override
    public String getName() {
        return "Conponent_1";
    }

    @Override
    public boolean onCall(CC cc) {
        String actionName = cc.getActionName();
        switch (actionName) {
            case "TestActivity":
//                CCUtil.navigateTo(cc, MainActivity.class);
                Intent intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setClass(cc.getContext(),TestActivity.class);
                cc.getContext().startActivity(intent);
                CC.sendCCResult(cc.getCallId(), CCResult.success());
                return false;
            default:
                CC.sendCCResult(cc.getCallId(), CCResult.errorUnsupportedActionName());
                break;
        }
        return false;
    }
}
