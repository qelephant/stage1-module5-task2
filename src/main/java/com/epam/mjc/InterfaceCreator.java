package com.epam.mjc;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> list.stream()
                .map(value -> value / divider)
                .collect(Collectors.toList());
    }
}
