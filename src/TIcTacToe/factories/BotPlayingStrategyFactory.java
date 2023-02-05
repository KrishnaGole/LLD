package TIcTacToe.factories;

import TIcTacToe.strategies.BotPlayingStratrgies.BotPlayingStrategy;
import TIcTacToe.strategies.BotPlayingStratrgies.EasyPlayingStrategy;
import TIcTacToe.strategies.BotPlayingStratrgies.HardPlayingStrategy;
import TIcTacToe.strategies.BotPlayingStratrgies.MediumPlayingStrategy;
import TIcTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        switch (botDifficultyLevel){
            case Easy:
                return new EasyPlayingStrategy();
            case Medium:
                return new MediumPlayingStrategy();
            case Hard:
                return new HardPlayingStrategy();
            default:
                return null;
        }
    }
}
