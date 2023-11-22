package com.joaolabs.firststeps.utils;

import com.joaolabs.firststeps.exceptions.UnsupportedMathOperationException;
import com.joaolabs.firststeps.utils.math.NumberUtils;

public class ControllerUtils {

    public static void validateParams(String... numbers) throws Exception {
        for (String number : numbers) {
            if (!NumberUtils.isNumeric(number)) {
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }
        }
    }
}
