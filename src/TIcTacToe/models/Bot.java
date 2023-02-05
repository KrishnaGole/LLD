package TIcTacToe.models;

import TIcTacToe.strategies.BotPlayingStratrgies.BotPlayingStrategy;
import TIcTacToe.factories.BotPlayingStrategyFactory;

public class Bot extends  Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    public Bot(String name, char symbol, BotDifficultyLevel botDifficultyLevel){
        super(name, symbol);
        this.setBotDifficultyLevel(botDifficultyLevel);
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }


    public Move decideMove(Board board){
        return this.botPlayingStrategy.decideMove(this, board);
    }
}
