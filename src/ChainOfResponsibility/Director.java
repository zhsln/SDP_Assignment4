package ChainOfResponsibility;

public class Director extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() < 10000)
            System.out.println("Director approved the expense for " + request.getPurpose());
        else if (nextApprover != null)
            nextApprover.handleRequest(request);
    }
}
