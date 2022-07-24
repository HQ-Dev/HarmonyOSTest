package com.example.abilityintent.slice;

import com.example.abilityintent.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;


public class MainAbilitySlice extends AbilitySlice {

    private Text backValueText;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        // start entering the NewAbilitySlice
        Component enterNewAbilitySliceButton = findComponentById(ResourceTable.Id_enter_newAbilitySlice);
        enterNewAbilitySliceButton.setClickedListener(listener -> presentForResult(new NewAbilitySlice(),new Intent(),0));

        // start entering the SecondAbility Page
        Component enterSecondAbilityButton = findComponentById(ResourceTable.Id_enter_second);
        enterSecondAbilityButton.setClickedListener(listener -> startEnterSecondAbility());

        backValueText = (Text) findComponentById(ResourceTable.Id_main_text);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        if (requestCode != 0 || resultIntent == null) {
            return;
        }
        String result = resultIntent.getStringParam("key");
        backValueText.setText(result);
    }
}
