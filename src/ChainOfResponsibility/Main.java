package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Approver approverChain = ApprovalChain.getApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(2500, "Team Building Event");
        ExpenseRequest request3 = new ExpenseRequest(7000, "New Servers");
        ExpenseRequest request4 = new ExpenseRequest(15000, "New Office Building");

        approverChain.handleRequest(request1);
        approverChain.handleRequest(request2);
        approverChain.handleRequest(request3);
        approverChain.handleRequest(request4);
    }
}
