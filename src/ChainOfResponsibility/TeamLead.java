package ChainOfResponsibility;

public class TeamLead extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() < 1000)
            System.out.println("TeamLead approved the expense for " + request.getPurpose());
        else if (nextApprover != null)
            nextApprover.handleRequest(request);
    }
}
