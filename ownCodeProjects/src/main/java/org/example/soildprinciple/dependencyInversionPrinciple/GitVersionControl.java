package org.example.soildprinciple.dependencyInversionPrinciple;

public class GitVersionControl implements IVersionControl{
    @Override
    public void commit(String message) {
        System.out.println("Committing changes to git with message: " + message);
    }

    @Override
    public void push() {
        System.out.println("Pushing changes to remote git repository");
    }

    @Override
    public void pull() {
        System.out.println("Pulling changes from remote git repository");
    }
}
