package org.example.soildprinciple.dependencyInversionPrinciple;

public interface IVersionControl {
    void commit(String message);
    void push();
    void pull();
}
