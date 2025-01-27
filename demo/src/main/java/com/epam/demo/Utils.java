package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false; // if any number is not positive, return false
            }
        }
        return true; // all numbers are positive
    }
}

