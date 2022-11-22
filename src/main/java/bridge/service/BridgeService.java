package bridge.service;

import bridge.BridgeMaker;
import bridge.BridgeNumberGenerator;

import java.util.List;

public class BridgeService {

    private final BridgeMaker bridgeMaker;

    public BridgeService(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
    }

    public List<String> generateBridge(Integer size) {
        return bridgeMaker.makeBridge(size);
    }

}
