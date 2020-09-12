package io.pan.jsonizator.rule;

import io.pan.jsonizator.rule.action.Action;
import io.pan.jsonizator.rule.condition.Condition;

public class DefaultRule implements Rule {

    private final Condition condition;
    private final Action action;

    public DefaultRule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public Condition condition() {
        return condition;
    }

    @Override
    public Action action() {
        return action;
    }
}
