package io.pan.jsonizator.rule.action;

public class Delete implements Action {

    private final String replacement;

    public Delete(String replacement) {
        this.replacement = replacement;
    }

    public Delete() {
        this("");
    }

    @Override
    public String get() {
        return replacement;
    }
}
