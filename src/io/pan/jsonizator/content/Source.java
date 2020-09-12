package io.pan.jsonizator.content;

import io.pan.jsonizator.rule.Rule;

import java.util.List;

public interface Source {

    Content apply(List<Rule> rules);
}
