package com.example.abilityintent.slice;

import com.example.abilityintent.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class SecondAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_second);

        Component secondBackFirstButton = findComponentById(ResourceTable.Id_second_back_first);
        secondBackFirstButton.setClickedListener(component -> terminate());

        Text showParametersText = (Text) findComponentById(ResourceTable.Id_second_text);
        showParametersText.setText(intent.getStringParam("key"));
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
