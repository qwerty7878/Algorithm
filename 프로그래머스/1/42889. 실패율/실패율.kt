class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {

    var stage = mutableMapOf<Int, Double>()
    var players = stages.size

    // 1~5
    (1..N).forEach {
        var failPlayer = stages.filter { stage -> it == stage }.count()
        // 이미 남은 플레이어어가 없으면 NaN이 들어가므로 0.0으로 처리 (아예 처음에 초기화 해줘도 될거 같긴 함) 
        stage[it - 1] =
            if (players != 0) {
                failPlayer.toDouble() / players.toDouble()
            } else {
                0.0
            }
        players -= failPlayer
    }

    return stage.toList().sortedByDescending { it.second }.map { it.first + 1 }.toIntArray()
    }
}