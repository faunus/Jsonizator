package io.pan.jsonizator.content;

import io.pan.jsonizator.rule.Rule;

public interface Content {

    Content modifyBy(Rule rule);
}
