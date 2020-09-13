package io.pan.jsonizator.rule.action;

public class AddQuotes implements Action {

    private final String replacement;

    public AddQuotes(String replacement) {
        this.replacement = replacement;
    }

    public AddQuotes() {
        this(" \"");
    }

    @Override
    public String get() {
        return replacement;
    }
}
