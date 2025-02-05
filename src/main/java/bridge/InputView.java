package bridge;

import bridge.validator.BridgeInputValidator;
import bridge.validator.MoveInputValidator;
import bridge.validator.RetryInputValidator;
import camp.nextstep.edu.missionutils.Console;

import static bridge.utils.ConvertUtil.convertStringToInteger;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String input = Console.readLine();
        BridgeInputValidator.validate(input);
        return convertStringToInteger(input);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String input = Console.readLine();
        MoveInputValidator.validate(input);
        return input;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        String input = Console.readLine();
        RetryInputValidator.validate(input);
        return input;
    }
}
