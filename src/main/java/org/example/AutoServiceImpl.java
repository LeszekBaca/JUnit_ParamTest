package org.example;

public class AutoServiceImpl {
    public boolean analyzeCarByParams(Integer treadThickness, Integer fuelUsage, Integer carMillage) {

        boolean millageNull = null == carMillage;
        boolean fuelUsageNull = null == fuelUsage;
        boolean treadThicknessNull = null == treadThickness;
        if (millageNull || fuelUsageNull || treadThicknessNull) {

            throw new IllegalArgumentException("Car details  null");
        }
        boolean isMillageCorrect = isCorrect(carMillage, RangeValue.MILLAGE);
        boolean isFuelUsageCorrect = isCorrect(fuelUsage, RangeValue.FUEL);

        boolean isTreadThicknessCorrect = isCorrect(treadThickness, RangeValue.TREAD);
        if (isMillageCorrect && isFuelUsageCorrect && isTreadThicknessCorrect) {

            return true;
        }
        return false;
    }

    private boolean isCorrect(Integer value, RangeValue validValues) {

        if (value < 0) {

            throw new IllegalArgumentException("Incorrect value");
        }
        Integer maxValue = validValues.getMaxValue();
        Integer minValue = validValues.getMinValue();

        if (value > minValue && value < maxValue) {

            return true;
        }
        return false;
    }
}
