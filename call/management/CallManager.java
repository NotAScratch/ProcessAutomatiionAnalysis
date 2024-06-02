package call.management;

import java.util.ArrayList;
import java.util.List;

public class CallManager {

    private List<Call> calls;

    public CallManager() {
        this.calls = new ArrayList<>();
    }

    public void addCall(Call call) {
        calls.add(call);
    }

    public void updateCall(String callID, Call updatedCall) {
        for (int i = 0; i < calls.size(); i++) {
            if (calls.get(i).getCallID().equals(callID)) {
                calls.set(i, updatedCall);
                return;
            }
        }
        // Throw exception or log if call not found
    }

    public boolean deleteCall(String callID) {
        for (int i = 0; i < calls.size(); i++) {
            if (calls.get(i).getCallID().equals(callID)) {
                calls.remove(i);
                return true;
            }
        }
        return false; // Call not found
    }

    public List<Call> searchCalls(String callID) {
        List<Call> foundCalls = new ArrayList<>();
        for (Call call : calls) {
            if (call.getCallID().equals(callID)) {
                foundCalls.add(call);
            }
        }
        return foundCalls;
    }
}
