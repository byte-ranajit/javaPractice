package org.example.soildprinciple.dependencyInversionPrinciple;

public class DevelopmentTeam {

    private IVersionControl versionControl;

    public DevelopmentTeam(IVersionControl versionControl){
        this.versionControl = versionControl;
    }

    public void makeCommit(String message){
        versionControl.commit(message);
    }

    public void performPush(){
        versionControl.push();
    }

    public void performPull(){
        versionControl.pull();
    }
}
