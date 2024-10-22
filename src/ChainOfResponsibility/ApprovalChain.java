package ChainOfResponsibility;

public class ApprovalChain {
    public static Approver getApprovalChain() {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        return teamLead;
    }
}
