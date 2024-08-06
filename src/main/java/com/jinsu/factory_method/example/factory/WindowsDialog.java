package com.jinsu.factory_method.example.factory;

import com.jinsu.factory_method.example.buttons.Button;
import com.jinsu.factory_method.example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}