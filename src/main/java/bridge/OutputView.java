package bridge;

import bridge.config.ConsoleMessage;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }

    public void printGameStart() {
        System.out.println(ConsoleMessage.GAME_START_MESSAGE);
    }

    public void printBridgeLengthInput() {
        System.out.println(ConsoleMessage.BRIDGE_LENGTH_INPUT_MESSAGE);
    }

    public void printMoveInput() {
        System.out.println(ConsoleMessage.MOVE_INPUT_MESSAGE);
    }

    public void printRetryInput() {
        System.out.println(ConsoleMessage.RETRY_INPUT_MESSAGE);
    }

    public void printFinalResultHeader() {
        System.out.println(ConsoleMessage.FINAL_RESULT_HEADER_MESSAGE);
    }

    public void printResultSuccessOrFailHeader() {
        System.out.println(ConsoleMessage.RESULT_SUCCESS_OR_FAIL_HEADER_MESSAGE);
    }

    public void printTotalGameTryCountHeader() {
        System.out.println(ConsoleMessage.TOTAL_GAME_TRY_COUNT_HEADER_MESSAGE);
    }

    public void printErrorMessage(Exception e) {
        System.out.println("[ERROR] " + e.getMessage());
    }


}
