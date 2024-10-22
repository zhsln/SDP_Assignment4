package ChainOfResponsibility;

import com.sun.net.httpserver.Request;

public abstract class Approver {
    protected Approver nextApprover; // Because we cannot use private in subclasses.

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public abstract void handleRequest(ExpenseRequest request);
}
