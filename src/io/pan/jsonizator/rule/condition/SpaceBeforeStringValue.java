package io.pan.jsonizator.rule.condition;

public class SpaceBeforeStringValue implements Condition {

    private final String spaceBeforeStringValueRegex;

    public SpaceBeforeStringValue(String spaceBeforeStringValueRegex) {
        this.spaceBeforeStringValueRegex = spaceBeforeStringValueRegex;
    }

    public SpaceBeforeStringValue() {
        this("(?<=:) (?!(null|true|false|\\[|\\{))");
    }

    @Override
    public String get() {
        return spaceBeforeStringValueRegex;
    }
}
