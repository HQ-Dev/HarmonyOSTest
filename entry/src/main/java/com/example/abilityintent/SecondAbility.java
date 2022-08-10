package com.example.abilityintent;

import com.example.abilityintent.slice.SecondAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class SecondAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SecondAbilitySlice.class.getName());
    }

    @Override
    protected void onActive() {
        super.onActive();
        Intent intent = new Intent();
        intent.setParam("key","我从储蓄罐的自我介绍中跳回来啦");
        setResult(0,intent);
    }
}
