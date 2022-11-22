package bridge.controller;

import bridge.BridgeNumberGenerator;
import bridge.InputView;
import bridge.OutputView;
import bridge.domain.Result;
import bridge.service.BridgeService;

public class BridgeController {
    private final InputView inputView;
    private final OutputView outputView;
    private final BridgeService bridgeService;

    public BridgeController(BridgeNumberGenerator bridgeNumberGenerator) {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.bridgeService = new BridgeService(bridgeNumberGenerator);
    }

    public void generateBridge() {
        bridgeService.generateBridge(inputView.readBridgeSize());
    }

}
