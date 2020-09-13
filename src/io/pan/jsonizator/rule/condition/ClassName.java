package io.pan.jsonizator.rule.condition;

public class ClassName implements Condition {

    private final String classNameRegex;

    public ClassName(String classNameRegex) {
        this.classNameRegex = classNameRegex;
    }

    public ClassName() {
        this("class .* ");
    }

    @Override
    public String get() {
        return classNameRegex;
    }
}
