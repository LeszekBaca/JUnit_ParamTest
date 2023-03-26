package org.example;

public enum RangeValue {
    CAR_MILLAGE(0, 100),

    FUEL_USAGE(0, 10),

    TREAD_THICKNESS(4, 1000);

    private Integer minValue;
    private Integer maxValue;

    RangeValue(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }
}
