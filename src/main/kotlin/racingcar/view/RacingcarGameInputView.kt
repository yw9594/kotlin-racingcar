package racingcar.view

import racingcar.model.RacingcarGameInput

class RacingcarGameInputView {
    fun getInput(): RacingcarGameInput {
        val carNumber = getInput("자동차 대수는 몇 대인가요?")?.toIntOrNull()

        require(carNumber != null) {
            "자동차 수는 자연수만 가능합니다."
        }

        val roundNumber = getInput("시도할 횟수는 몇 회인가요?")?.toIntOrNull()

        require(roundNumber != null) {
            "시도 횟수는 자연수만 가능합니다."
        }

        return RacingcarGameInput(
            carNumber = carNumber,
            roundNumber = roundNumber
        )
    }

    private fun getInput(message: String): String? {
        println(message)

        return readlnOrNull()
    }
}