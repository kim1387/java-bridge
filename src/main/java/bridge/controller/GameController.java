package bridge.controller;

import bridge.InputView;
import bridge.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;

    public GameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public String inputMove() {
        outputView.printMoveInput();
        return inputView.readMoving();
    }

    public String inputRetry() {
        outputView.printRetryInput();
        return inputView.readGameCommand();
    }

    public void printResult() {
        outputView.printResult();
    }
}
