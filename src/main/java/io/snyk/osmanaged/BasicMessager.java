package io.snyk.osmanaged;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class BasicMessager {
    public String getMessage(String name) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(name), "`name` can't be NULL or empty");
        return "Hello from " + name;
    }
}