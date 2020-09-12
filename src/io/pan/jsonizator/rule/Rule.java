package io.pan.jsonizator.rule;

import io.pan.jsonizator.rule.action.Action;
import io.pan.jsonizator.rule.condition.Condition;

public interface Rule {

    Condition condition();
    Action action();
}
