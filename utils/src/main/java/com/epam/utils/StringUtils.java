package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;
public class StringUtils {
    if (str == null || str.isEmpty()) {
        return false; // null or empty string is not a positive number
    }
        try {
            double number = Double.parseDouble(str);
            return number > 0; // check if the number is positive
        } catch (NumberFormatException e) {
            return false; // not a valid number
        }
    }
}
