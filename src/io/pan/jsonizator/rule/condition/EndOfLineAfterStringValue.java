package io.pan.jsonizator.rule.condition;

public class EndOfLineAfterStringValue implements Condition {

    private final String endOfLineAfterStringValueRegex;

    public EndOfLineAfterStringValue(String endOfLineAfterStringValueRegex) {
        this.endOfLineAfterStringValueRegex = endOfLineAfterStringValueRegex;
    }

    public EndOfLineAfterStringValue() {
        this(String.format("(?<!null|true|false|\\[|\\]|\\{|\\})(?<=\\b)%s", System.lineSeparator()));
    }

    @Override
    public String get() {
        return endOfLineAfterStringValueRegex;
    }
}
