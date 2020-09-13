package io.pan.jsonizator.rule.action;

public class AddEndLineQuotes implements Action {

    private final String replacement;

    public AddEndLineQuotes(String replacement) {
        this.replacement = replacement;
    }

    public AddEndLineQuotes() {
        this(String.format("\"%s", System.lineSeparator()));
    }
    @Override
    public String get() {
        return replacement;
    }
}
