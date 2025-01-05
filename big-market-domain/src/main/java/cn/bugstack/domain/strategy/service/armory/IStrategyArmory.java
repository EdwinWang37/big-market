package cn.bugstack.domain.strategy.service.armory;

public interface IStrategyArmory {

    void assembleLotteryStrategy(Long strategyId);

    Integer getRandomAwardId(Long strategyId);
}