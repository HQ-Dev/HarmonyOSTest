package com.example.abilityintent.slice;

import com.example.abilityintent.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;

public class NewAbilitySlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main_new);

        Component newToMainButton = findComponentById(ResourceTable.Id_new_to_main);
        newToMainButton.setClickedListener(component -> terminate());
    }

    @Override
    protected void onActive() {
        super.onActive();

        Intent intent = new Intent();
        intent.setParam("key","我从储蓄罐里跳出来了");
        setResult(intent);
    }

    @Override
    protected void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
